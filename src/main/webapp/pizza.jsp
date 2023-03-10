<%--
  Created by IntelliJ IDEA.
  User: gonzaloovalle
  Date: 3/8/23
  Time: 4:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<%@include file="partials/head.jsp"%>
<body>

    <form action="/pizza-order" method="post">
        <label for="crust">Choose your crust:</label>
        <select id="crust" name="crust">
            <option value="traditional">Traditional</option>
            <option value="pan">Pan</option>
            <option value="thin">Thin</option>
            <option value="stuffed">Stuffed</option>
        </select>
        <label for="sauce">Choose your sauce:</label>
        <select id="sauce" name="sauce">
            <option value="marinara">Marinara</option>
            <option value="alfredo">Alfredo</option>
            <option value="vodka">Vodka</option>
        </select>
        <fieldset>
            <legend>Choose your toppings</legend>
            <div>
                <input type="checkbox" id="pepperoni" name="topping" value="pepperoni" />
                <label for="pepperoni">Pepperoni</label>
            </div>
            <div>
                <input type="checkbox" id="ham" name="topping" value="ham" />
                <label for="ham">Ham</label>
            </div>
            <div>
                <input type="checkbox" id="bacon" name="topping" value="bacon" />
                <label for="bacon">Bacon</label>
            </div>
            <div>
                <input type="checkbox" id="sausage" name="topping" value="sausage" />
                <label for="sausage">Sausage</label>
            </div>
            <div>
                <input type="checkbox" id="chicken" name="topping" value="chicken" />
                <label for="chicken">Chicken</label>
            </div>
            <div>
                <input type="checkbox" id="jalapeno" name="topping" value="jalapeno" />
                <label for="jalapeno">Jalapeno</label>
            </div>
            <div>
                <input type="checkbox" id="onion" name="topping" value="onion" />
                <label for="onion">Onion</label>
            </div>
            <div>
                <input type="checkbox" id="olive" name="topping" value="olive" />
                <label for="olive">Olive</label>
            </div>
            <div>
                <input type="checkbox" id="mushroom" name="topping" value="mushroom" />
                <label for="mushroom">Mushroom</label>
            </div>
            <div>
                <input type="checkbox" id="banana-pepper" name="topping" value="banana-pepper" />
                <label for="banana-pepper">Banana Pepper</label>
            </div>
        </fieldset>
        <label for="size">Choose your size:</label>
        <select id="size" name="size">
            <option value="personal">Personal</option>
            <option value="small">Small</option>
            <option value="medium">Medium</option>
            <option value="large">Large</option>
        </select>
        <label for="address">Tell us where to deliver:</label>
        <input type="text" name="address" id="address">
    </form>

</body>
</html>
