<%-- 
    Document   : newImage
    Created on : 16-Jul-2016, 21:38:23
    Author     : James Loveday
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Image</title>
    </head>
    <body>
        <p>You can upload a new image using this page</p>
        <form name="uploadImageForm" action="/images/uploadImage" method="POST" enctype="multipart/form-data">
            <p>File to upload: <input type="file" name="image" value="" /></p>
            <p>Title for the image: <input type="text" name="imageTitle" value="" size="50" /></p>
            <p>Form for the image: <input type="text" name="imageForm" value="" size="50" /></p>
            <p>Section for the image: <input type="text" name="imageSection" value="" size="50" /></p>
                <imput type="submit" value="Upload"/>
        </form>
    </body>
</html>
