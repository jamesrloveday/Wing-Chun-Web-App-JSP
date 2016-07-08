<%-- 
    Document   : siuNimTaoForm
    Created on : 25-Jun-2016, 21:20:57
    Author     : James Loveday
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Siu Nim Tao Form</title>
    </head>
    <body>
        <h1>Siu Nim Tao Form</h1>
        <div id="siuNimTaoImages" class="imagesClass">
            <c:forEach items="${siuNimTaoImages}" var="image">
                <ul>
                    <li>${image.fileLocation}</li>
                    <li>${image.title}</li>
                    <li>${image.sectionName}</li>
                    <li>${image.form}</li>
                </ul>

            </c:forEach>
        </div>
            <%@include file="navigator.jsp" %>
    <%@include file="logout.jsp" %>
    </body>
</html>
