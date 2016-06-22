<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Register</title>
</head>
<body>
    <p><h3>Enter your details to register, <b>all fields must be completed</b></h3></p>
<form id="registerNewUserForm" action="/registerNewUserDetails" method="post">
    <p>Enter a username: <input type="text" name="username" value="username" size="30" /></p>
    <p>Enter a password: <input type="password" name="password" value="" size="30" /></p>
    <p>Enter your first name: <input type="text" name="firstName" value="first name" size="30" /></p>
    <p>Enter your last name: <input type="text" name="lastName" value="last name" size="30" /></p>
    <p>Enter your instructors name: <input type="text" name="instructorName" value="instructor name" size="30" /></p>
    <p>Enter your club location: <input type="text" name="clubLocation" value="club location" size="30" /></p>
    <p>Enter your email: <input type="text" name="email" value="email@email.com" size="40" /></p>
    <input type="submit" value="Register" name="registerBtn" />&nbsp;
    <input type="reset" value="Cancel" name="Cancel" />
</form>

<!-- Enter info here about the sites terms and conditions and a link to them-->

<!-- Form validation here for t's and c's check box-->
</body>
</html>