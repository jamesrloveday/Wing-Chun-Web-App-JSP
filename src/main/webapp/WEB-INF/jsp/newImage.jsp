<%-- 
    Document   : newImage
    Created on : 16-Jul-2016, 21:38:23
    Author     : James Loveday
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Image</title>
    </head>
    <body>
        <p>You can upload a new image using this page</p>
    <c:if test="${not empty errorMessage}">
        ${errorMessage}
    </c:if>
        <form name="uploadImageForm" action="/images/uploadImage" method="POST" enctype="multipart/form-data">
            <p>File to upload: <input type="file" name="image" value="" /></p>
            <p>Title for the image: <input type="text" name="imageTitle" value="" size="50" /></p>
            <p>Form for the image: <input type="text" name="imageForm" value="" size="50" /></p>
            <p>Section for the image: <input type="text" name="imageSection" value="" size="50" /></p>
                <input type="submit" value="Upload" /> &nbsp; <input type="reset" value="Clear" />

		<p>Note if you are unsure about posting an image speak to your instructor before uploading. 
		You can also consult with the rules of use <a href="/wingchun/termsAndConditions" >here</a></p>
        </form>
    </body>
</html>
