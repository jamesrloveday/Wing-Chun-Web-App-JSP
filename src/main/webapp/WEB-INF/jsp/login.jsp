<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<html>
<head>
    <link rel="stylesheet" type="text/css" media="all" href="/resources/css/global.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Log in</title>
</head>
<body>
<h3>Please login to access the wiki</h3>

<div class="loginBox" >
    <form:form id="loginForm" action="/wingchun/home" method="post" commandName="user">
        <p>Username: <form:input path="username" type="text" id="username" value="${user.username}" size="30"/></p>
        <p>Password:<form:input path="password" type="password" id="password" value="${user.password}" size="25"/></p>
        <br/>
        <input type="submit" name="loginUser" value="Login"/>&nbsp;<input type="reset" value="cancel"/>
    </form:form>
</div>
<br />
<br />

<div id="registerPageId">
    <a href="/wingchun/register/newUserPage">Register New User</a>

</div>

</body>
</html>