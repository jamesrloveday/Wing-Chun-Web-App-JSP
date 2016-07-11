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
        <link rel="stylesheet" type="text/css" media="all" href="/resources/css/images.css"/>
        <title>Siu Nim Tao Form</title>
    </head>
    <body>
        <h1>Siu Nim Tao Form</h1>
          <%@include file="navigator.jsp" %>
        <div id="siuNimTaoImages" class="imagesClass">
            <c:forEach items="${siuNimTaoImages}" var="image">
                <table>
                    <tbody>
                        <tr>
                            <td><img src="${image.fileLocation}" width="429" height="560" alt="basic stance"/></td>
                        </tr>
                        <tr>
                            <td>Technique: ${image.title}</td>
                        </tr>
                        <tr>
                            <td>Section: ${image.sectionName}</td>
                        </tr>
                        <tr>
                            <td>Form: ${image.form}</td>
                        </tr>
                    </tbody>
                </table>
            </c:forEach>
        </div>
    <%@include file="logout.jsp" %>
    </body>
</html>
