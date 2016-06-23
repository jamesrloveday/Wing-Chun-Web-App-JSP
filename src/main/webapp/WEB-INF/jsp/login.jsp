<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" media="all" href="/resources/css/global.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Log in</title>
</head>
<body>
<h3>Please login to access the wiki</h3>

<div class="loginBox" >
    <form id="loginForm" action="/wingchun/home" method="post">
        <p>Username: <input name="username" type="text" id="username" value="" size="30"/></p>
        <p>Password:<input name="password" type="password" id="password" value="" size="25"/></p>
        <br/>
        <input type="submit" name="loginUser" value="Login"/>&nbsp;<input type="reset" value="cancel"/>
    </form>
</div>
<br />
<br />

<div id="registerPageId">
    <a href="/wingchun/register/newUserPage">Register New User</a>

</div>

</body>
</html>