<jsp:useBean id="resultLeft" scope="request" type="java.lang.Double"/>
<jsp:useBean id="resultRight" scope="request" type="java.lang.Double"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Result</title>
</head>
<body style="display: flex; flex-direction: column; align-items: center;">
<p><b>Left result:</b> ${resultLeft}</p>
<p><b>Right result:</b> ${resultRight}</p>
</body>
</html>
