<%@ page import="org.zero.ds2.model.ResultModel" %>
<%@ page import="org.zero.ds2.model.Result" %>
<%@ page import="java.util.List" %>
<jsp:useBean id="result" scope="request" type="org.zero.ds2.model.ResultModel"/>
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

<h2>Entered Data</h2>
<table>
    <tr>
        <th>A</th>
        <th>B</th>
        <th>C</th>
    </tr>
    <tr>
        <td>${result.a()}</td>
        <td>${result.b()}</td>
        <td>${result.c()}</td>
    </tr>
</table>
<h2>Calculate Result</h2>
<table style="border: 1px solid black">
    <tr>
        <th>X</th>
        <th>Y</th>
    </tr>
    <%
        List<Result> list = ((ResultModel) request.getAttribute("result")).resultList();
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
