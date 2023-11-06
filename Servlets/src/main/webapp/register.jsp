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
    </div>

</header>

    <main>


        <aside>

            <h2><span> Create account</span></h2>
            <h3>${requestScope.msg}</h3>
            <br/>
            <div>
                <form action="registerUser" method="post">
                    <label>Name</label> <input placeholder="5 or more characters" type="text" name="fname" id="fname"><br/>
                    <label>Password</label> <input placeholder="8 or more characters" type="password" name="password" id="password"><br/>
                    <label>Email</label> <input placeholder="example@domain.com" type="email" name="email" id="email"><br>
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
