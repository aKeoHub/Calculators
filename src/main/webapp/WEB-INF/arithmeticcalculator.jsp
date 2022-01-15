<%-- 
    Document   : arithmeticcalculator
    Created on : 14-Jan-2022, 6:26:45 AM
    Author     : Kingston
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
             <form action="arithmetic" method="post">
            <label for="first">First:</label>
            <input type="number" name="first" id="first">
            <br>
            <label for="second">Second:</label>
            <input type="number" name="second" id="second">
            <br>
            <input type="submit" name="plus" id="plus" value="+">
            <input type="submit" name="minus" id="minus" value="-">
            <input type="submit" name="multiply" id="multiply" value="*">
            <input type="submit" name="modulus" id="modulus" value="%">

            
          
            <br>
            
            <br>
            <a href="age">Age Calculator</a>
            
            
            
        </form>
        <p>${message}</p>
    </body>
</html>
