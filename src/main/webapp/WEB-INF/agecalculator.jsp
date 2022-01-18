<%-- 
    Document   : agecalculator
    Created on : 13-Jan-2022, 7:14:25 PM
    Author     : Kingston
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="/Calculators/css/style.css" rel="stylesheet"></link>
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <form action="age" method="post">
            <label for="age">Enter your age:</label>
            <input type="number" name="age" id="age">
            
          
            <br>
            <button type="submit">Age next birthday</button>
            <br>
            <p>${message}</p>
            <br>
            <a href="arithmetic">Arithmetic Calculator</a>
            
            
        </form>
        
        
    </body>
</html>