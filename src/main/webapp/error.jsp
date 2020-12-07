<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1" />
    <title>Home</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<jsp:include page="head-default.jsp">
    <jsp:param name="title" value="Welkom"/>
</jsp:include>

<body>

<jsp:include page="navbar.jsp">
    <jsp:param name="activePage" value="home"/>
</jsp:include>


        ${error} (Error)
    <footer>
        &copy; Webontwikkeling 3, UC Leuven-Limburg
    </footer>

</body>
</html>