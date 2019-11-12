<%--
  Created by IntelliJ IDEA.
  User: vuanh
  Date: 2019-11-12
  Time: 10:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đây là trang chi tiết</title>
</head>
<body>
<h2>Detail</h2>
<table>
    <tr>
        <td>Name :</td>
        <td>${customer.name}</td>
    </tr>
    <tr>
        <td>Email :</td>
        <td>${customer.email}</td>
    </tr>
    <tr>
        <td>Address :</td>
        <td>${customer.address}</td>
    </tr>
</table>
</body>
</html>
