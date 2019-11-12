<%--
  Created by IntelliJ IDEA.
  User: vuanh
  Date: 2019-11-12
  Time: 10:26
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
    <title>Đây là form tạo mới</title>
</head>
<body>
<h3>Welcome, Enter The Employee Details</h3>
<form:form method="POST" action="addCustomer" modelAttribute="customer">
    <table>
        <tr>
            <td><form:label path="name">Employee's name: </form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="email">Contact's number: </form:label></td>
            <td><form:input path="email"/></td>
        </tr>

        <tr>
            <td><form:label path="address">Contact's number: </form:label></td>
            <td><form:input path="address"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>
        </tr>
    </table>
</form:form>
</body>
</html>
