<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>

<jsp:include page="head-default.jsp">
    <jsp:param name="title" value="Product Overview"/>
</jsp:include>

<body>

<jsp:include page="navbar.jsp">
    <jsp:param name="activePage" value="products"/>
</jsp:include>

        <main>
            <c:choose>
                <c:when test="${empty broodjes && empty pastas && empty soepen}">
                    <p>Er zijn momenteel nog geen broodjes op het menu.</p>
                </c:when>
            </c:choose>
            <c:choose>
                <c:when test="${not empty broodjes}">
                    <table>
                    <h2>Broodjes</h2>
                <tr>
                    <th>Naam</th>
                    <th>Prijs</th>
                    <th>Informatie</th>
                </tr>
                <c:forEach var="broodje" items="${broodjes}">
                    <tr>
                        <td><c:out value="${broodje.naam}"/></td>
                        <td>€<c:out value="${broodje.prijs}"/></td>
                        <td><c:out value="${broodje.extraInfo}"/></td>
                    </tr>
                </c:forEach>
            </table>
                </c:when>
            </c:choose>
            <br>
            <c:choose>
                <c:when test="${not empty pastas}">
                    <table>
                        <h2>Pasta's</h2>
                        <tr>
                            <th>Naam</th>
                            <th>Prijs</th>
                            <th>Informatie</th>
                        </tr>
                        <c:forEach var="pasta" items="${pastas}">
                            <tr>
                                <td><c:out value="${pasta.naam}"/></td>
                                <td>€<c:out value="${pasta.prijs}"/></td>
                                <td><c:out value="${pasta.extraInfo}"/></td>
                            </tr>
                        </c:forEach>
                    </table>
                </c:when>
            </c:choose>
            <br>
            <c:choose>
                <c:when test="${not empty soepen}">
                    <table>
                        <h2>Soepen</h2>
                        <tr>
                            <th>Naam</th>
                            <th>Prijs</th>
                            <th>Informatie</th>
                        </tr>
                        <c:forEach var="soep" items="${soepen}">
                            <tr>
                                <td><c:out value="${soep.naam}"/></td>
                                <td>€<c:out value="${soep.prijs}"/></td>
                                <td><c:out value="${soep.extraInfo}"/></td>
                            </tr>
                        </c:forEach>
                    </table>
                </c:when>
            </c:choose>
        </main>

<jsp:include page="footer.jsp"/>

</body>
</html>