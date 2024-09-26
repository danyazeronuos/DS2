<jsp:useBean id="iterations" scope="request" type="java.lang.Integer"/>
<jsp:useBean id="e" scope="request" type="java.lang.Double"/>
<jsp:useBean id="x" scope="request" type="java.lang.Double"/>
<jsp:useBean id="resultLeft" scope="request" type="java.lang.Double"/>
<jsp:useBean id="resultRight" scope="request" type="java.lang.Double"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body style="display: flex; flex-direction: column; align-items: center;">
<style>
    table, th, td {
        border: 1px solid black;
        border-collapse: collapse;
    }
    th, td {
        padding: 5px;
    }
</style>
<table>
    <tr>
        <th>X</th>
        <th>E</th>
        <th>Iterations</th>
    </tr>
    <tr>
        <td>${x}</td>
        <td>${e}</td>
        <td>${iterations}</td>
    </tr>
</table>
<p><b>Left result:</b> ${resultLeft}</p>
<p><b>Right result:</b> ${resultRight}</p>
</body>
</html>
