<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" type="text/css" media="all" href="/resources/css/global.css"/>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Log in</title>
</head>
<body>
<h3>Please login to access the wiki</h3>

<div class="loginBox" >
    <form id="loginForm" action="/home" method="GET">
        <p>Username: <input type="text" id="username" value="" size="30"/></p>
        <p>Password:<input type="password" id="password" value="" size="25"/></p>
        <br/>
        <input type="submit" value="Login"/>&nbsp;<input type="reset" value="cancel"/>
    </form>
</div>
<br />
<br />

<div id="registerPageId">
    <a href="/register/newUserPage">Register New User</a>

</div>

</body>
</html>