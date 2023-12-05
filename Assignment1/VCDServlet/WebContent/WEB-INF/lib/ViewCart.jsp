<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Shopping Cart Example - View Cart</title>
</head>
<body bgcolor="#33CCFF">
    <center>
        <table border="0" cellpadding="0" width="100%" bgcolor="#FFFFFF">
            <!-- Table contents from ShoppingServlet.java -->
            <%-- Use Java code to iterate over the buylist and display the items --%>
        </table>
        <center>
            <a href="index.html">shopping</a>&nbsp;&nbsp;
            <a href="ShoppingServlet?action=CHECKOUT">checkout</a>
            &nbsp;&nbsp;<a href="ShoppingServlet?action=LOGOUT">logout/remove</a>
        </center>
    </body>
</html>
