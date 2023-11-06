<%--
  Created by IntelliJ IDEA.
  User: Gabriel
  Date: 10/22/2023
  Time: 11:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
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
        <a href="registerUser">
            <li>Create Account</li>
        </a>
        <a href="login" id="inscreva-se-btn">
            <li>Login</li>
        </a>
    </ul>
</header>

<main>


    <aside>

        <h2><span> Login </span></h2>
        <h3>${requestScope.msg}</h3>
        <br/>
        <div>
            <form action="login" method="post">
                <label>Name</label> <input placeholder="5 or more characters" type="text" name="fname" id="fname"><br/>
                <label>Password</label> <input placeholder="8 or more characters" type="password" name="password" id="password"><br/>
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

