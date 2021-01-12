<%--
  Created by IntelliJ IDEA.
  User: tcro142
  Date: 7/01/2020
  Time: 6:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="../site.css">
</head>
<body>

<div id="header">

    <h1>Exercise Two Display</h1>

</div>

<div id="main">

    <h2>Liked and favourite dinosaurs</h2>

    <%--TODO: Your code here to display dinosaurs with a rating of 'like' or 'favourite'... --%>
    <c:forEach var="singleDinosaur" items="${dinosaurs}">
        <c:if test="${singleDinosaur.rating == 'favourite' || singleDinosaur.rating == 'like'}">
            <h3> ${singleDinosaur.name}</h3>
            <h4>Rating: </h4> <p>${singleDinosaur.rating}</p>
            <c:if test="${singleDinosaur.notes != ''}">
                <h4>Notes</h4> <p>${singleDinosaur.notes}</p>
            </c:if>
            <c:if test="${singleDinosaur.notes == ''}">
                <p>Sorry, there are no notes for that dinosaur...</p>
            </c:if>
        </c:if>
    </c:forEach>

    <br>
    <br>
    <h2>Disliked dinosaurs:</h2>

    <%--TODO: Your code here to display the names of dinosaurs with a rating of 'dislike'... --%>
    <c:forEach var="singleDinosaur" items="${dinosaurs}">
        <c:if test="${singleDinosaur.rating == 'dislike'}">
            ${singleDinosaur.name}
        </c:if>

    </c:forEach>

</div>

</body>
</html>
