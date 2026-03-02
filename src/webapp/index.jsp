<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hello JSP</title>
</head>
<body>
    <h1>Hello from JSP!</h1>

    <p>Current time: <%= new java.util.Date() %></p>

    <form action="hello" method="get">
        <input type="text" name="name" placeholder="Enter your name">
        <button type="submit">Submit</button>
    </form>

    <%
        String name = request.getParameter("name");
        if (name != null) {
    %>
        <h2>Hello, <%= name %>!</h2>
    <%
        }
    %>
</body>
</html>