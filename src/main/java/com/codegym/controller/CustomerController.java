package com.codegym.controller;


import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import com.codegym.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("customers/")
public class CustomerController {

    private CustomerService customerService = new CustomerServiceImpl();

    @RequestMapping(value = "create", method = RequestMethod.GET)
    public String showForm(ModelMap model) {
        model.addAttribute("customer", new Customer());
        return "customers/create";
    }

    @RequestMapping(value = "/addCustomer", method = RequestMethod.POST)
    public String submit(@ModelAttribute("customer") Customer customer) {
        int id = (int)(Math.random() * 10000);
        customer.setId(id);
        customerService.save(customer);
        return "redirect:/customers/";
    }

    @GetMapping("/")
    public ModelAndView showListCustomers(){
        ModelAndView modelAndView = new ModelAndView("customers/list");
        List<Customer> customers = this.customerService.findAll();
        modelAndView.addObject("customers", customers);
        return modelAndView;
    }

    @GetMapping("view/{customerId}")
    public ModelAndView view(@PathVariable Integer customerId){
        Customer customer = this.customerService.findById(customerId);
        ModelAndView modelAndView = new ModelAndView("customers/info");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @GetMapping("edit/{customerId}")
    public ModelAndView editForm(@PathVariable Integer customerId){
        Customer customer = this.customerService.findById(customerId);
        ModelAndView modelAndView = new ModelAndView("customers/edit");
        modelAndView.addObject("customer", customer);
        return modelAndView;
    }

    @PostMapping("edit/{customerId}")
    public String editCustomer(@PathVariable Integer customerId, @ModelAttribute("customer") Customer customer){
        this.customerService.update(customerId, customer);
        return "redirect:/customers/";
    }

    @GetMapping("delete/{customerId}")
    public String editCustomer(@PathVariable Integer customerId){
        this.customerService.remove(customerId);
        return "redirect:/customers/";
    }

}
