<%--
  Created by IntelliJ IDEA.
  User: Gabriel
  Date: 10/23/2023
  Time: 12:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="pt">
<head>
    <title>Subscribe</title>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
</head>

<body>
<header>
    <div id="title">
        <h1>Gabuh</h1>
        <!-- <h1></h1> -->

    </div>
    <ul>
        <a href="events">
            <li>Events</li>
        </a>
        <a href="home">
            <li>Logout</li>
        </a>
    </ul>
</header>

<main>


    <aside>

        <h2><span>Create An Event</span></h2>
        <h3>${requestScope.msg}</h3>
        <br/>
        <div>
            <form action="createEvent" method="post">
                <label>Description</label> <input placeholder="5 or more characters" type="text" name="description" id="description"><br/>
                <label>Date</label> <input placeholder="" type="date" name="date" id="date"><br/>
                <input type="submit" value="Submit" id="register-button">
            </form>
        </div>

    </aside>


    <article>
        <img src="./components/images/white-logo.png" alt="gabuh-logo">

    </article>

</main>


<script src="registerScript.js"></script>
</body>
</html>
