<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 22, 2020, 12:43:03 PM
    Author     : 584893
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
        <form action="arithmetic" method="POST">
            First <input type="text" name="first" value="${first}" />
            <br>
            Second <input type="text" name="second" value="${second}" />
            <br>
            <input type="submit" name="+" value="+" />
            <input type="submit" name="-" value="-" />
            <input type="submit" name="*" value="*" />
            <input type="submit" name="%" value="%" />
            <br>
            <p>Result: ${message}</p>
            <a href="/Week3Lab_Calculators/age">Age Calculator</a>

        </form>
    </body>
</html>
