<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Register</title>
</head>
<body>
    <p><h3>Enter your details to register, <b>all fields must be completed</b></h3></p>
<form id="registerNewUserForm" action="/wingchun/registerNewUserDetails" method="post">
    <p>Enter a username*: <input type="text" name="username" value="" size="30" /></p>
    <p>Enter a password*: <input type="password" name="password" value="" size="30" /></p>
    <p>Enter your first name*: <input type="text" name="firstName" value="" size="30" /></p>
    <p>Enter your last name*: <input type="text" name="lastName" value="" size="30" /></p>
    <p>Enter your instructors name*: <input type="text" name="instructorName" value="" size="30" /></p>
    <p>Enter your club location*: <input type="text" name="clubLocation" value="" size="30" /></p>
    <p>Enter your email*: <input type="text" name="email" value="" size="40" /></p>
    <input type="submit" value="Register" name="registerBtn" />&nbsp;
    <input type="reset" value="Cancel" name="Cancel" />
</form>

<p>*required field</p>

<!-- Enter info here about the sites terms and conditions and a link to them-->
<p><a href="/wingchun/register/termsAndConditions">Read the terms and conditions</a></p>

<!-- Form validation here for t's and c's check box-->
<p>confirm you have read the t's and c's <input type="checkbox" name="tAndCBox" value="ON" /></p>
<p></p>
</body>
</html>