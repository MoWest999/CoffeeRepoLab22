<%--
  Created by IntelliJ IDEA.
  User: Grand Circus Student
  Date: 8/11/2017
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Form</title>
</head>
<body>
${inst}
<form action="formhandler" method="post">
  first name: <input type = "text" name="firstname"><br>
    last name: <input type = "text" name="lastname"><br>
    Email:<input type="text" name="email"><br>
    phone number: <input type = "number" name="phone number"><br>
    password: <input type = "text" name="password"><br>

    <input type="submit" name="submit" value="Submit">

</form>
</body>
</html>
