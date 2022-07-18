<%--
  Created by IntelliJ IDEA.
  User: jaytenn
  Date: 7/15/22
  Time: 12:13 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="pizza-order" method="post">
        Welcome to PizzaPalace!<br>
        Please select your pizza size:<br>
        <input type="radio" name="size" value="small">Small<br>
        <input type="radio" name="size" value="medium">Medium<br>
        <input type="radio" name="size" value="large">Large<br>
        <br>
        choose sauce:<br>
        <input type="radio" name="sauce" value="marinara">Marinara<br>
        <input type="radio" name="sauce" value="alfredo">Alfredo<br>
        <input type="radio" name="sauce" value="pesto">Pesto<br>

        <br>
         choose crust type:<br>
        <input type="radio" name="crust" value="thin">Thin Crust<br>
        <input type="radio" name="crust" value="thick">Thick Crust<br>
        <input type="radio" name="crust" value="pan">Pan Crust<br>
        <br>
        Pizza Toppings:<br>
        <input type="checkbox" name="toppings" value="pepperoni">Pepperoni<br>
        <input type="checkbox" name="toppings" value="sausage">Sausage<br>
        <input type="checkbox" name="toppings" value="mushrooms">Mushrooms<br>
        <input type="checkbox" name="toppings" value="extra cheese">Extra Cheese<br>
        <input type="checkbox" name="toppings" value="pineapple">Pineapple<br>

        <br>
        <input type="text" name="address" placeholder="Address"><br>
        <input type="text" name="city" placeholder="City"><br>
        <input type="text" name="state" placeholder="State"><br>
        <input type="text" name="zip" placeholder="Zip"><br>

        <input type="submit" value="Order Pizza">
    </form>
</body>
</html>
