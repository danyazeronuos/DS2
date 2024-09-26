<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Calculator</title>
</head>
<body>
<style>
    label {
        gap: 5px;
        display: flex;
        flex-direction: column;
    }
    form {
        gap: 12px;
        display: flex;
        align-items: center;
        flex-direction: column;
    }
</style>
<h2>Sum Calculator:</h2>
<form method="post" action="sum">
    <label>
        Enter x:
        <input name="x" placeholder="Enter x" required>
    </label>
    <label>
        Enter iterations:
        <input name="iterations" placeholder="Enter iterations" required>
    </label>
    <label>
        Enter e:
        <input name="e" placeholder="Enter e" required>
    </label>
    <button type="submit">Calculate</button>
</form>

<h2>Tabulation Calculator:</h2>
<form method="post" action="tabulation">
    <label>
        Enter start:
        <input name="start" placeholder="Enter start" required>
    </label>
    <label>
        Enter finish:
        <input name="finish" placeholder="Enter finish" required>
    </label>
    <label>
        Enter step:
        <input name="step" placeholder="Enter step" required>
    </label>
    <button type="submit">Calculate</button>
</form>
</body>
</html>