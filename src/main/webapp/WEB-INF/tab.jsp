<%@ page import="java.util.List" %>
<%@ page import="org.zero.ds2.model.Result" %><%--
  Created by IntelliJ IDEA.
  User: daniilmozzhukhin
  Date: 26.09.2024
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<style>
    table, th, td {
        border: 1px solid black;
        border-collapse: collapse;
    }
    th, td {
        padding: 5px;
    }
</style>

<table style="border: 1px solid black">
    <tr>
        <th>X</th>
        <th>Y</th>
    </tr>
    <%
        List<Result> list = (List<Result>) request.getAttribute("result");
        for (Result r : list) {
    %>
    <tr>
        <td><%= r.getFirst()%>
        </td>
        <td><%= r.getSecond()%>
        </td>
    </tr>
    <%
        }
    %>
</table>


</body>
</html>
