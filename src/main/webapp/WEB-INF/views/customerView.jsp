<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Grand Circus Student
  Date: 8/15/2017
  Time: 5:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<head>
    <title>Customer List</title>
</head>
<body>
<table border = "1">
    <tr>
        <th>Items</th>
        <th>Description</th>
        <th>Quantity</th>
        <th>Price</th>
    </tr>
    <c:forEach items="${cList}" var="item"> <%--jstl tag --%>
        <tr>
            <td>
                    ${item.items}
            </td>
            <td>
                    ${item.description}
            </td>
            <td>
                    ${item.quantity}
            </td>
            <td>
                    ${item.price}
            </td>
        </tr>
    </c:forEach>

</table>
</body>
</html>

