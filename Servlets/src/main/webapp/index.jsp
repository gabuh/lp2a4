<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="styles.css">
    <title>Newsletter Gabu</title>
</head>

<body>
    <header>
        <div id="title">
            <h1>Gabuh</h1>
            <!-- <h1></h1> -->

        </div>
        <ul>
            <a onclick="alert('There is no backend')"><li>Início</li></a>
            <a onclick="alert('There is no backend')"><li>Serviços</li></a>
            <a onclick="alert('There is no backend')"><li>Sobre</li></a>
            <a onclick="alert('There is no backend')"><li>Contato</li></a>
            <a onclick="alert('There is no backend')" id="inscreva-se-btn"><li>Já tem uma conta?</li></a>
            <label  class="switch"> <input id="theme-switch" type="checkbox"> <span class="slider round"></span> </label>
        </ul>
    </header>

    <main>
        <aside>
            <h2><span>Inscreva-se agora</span></h2>
            <h2>Na Newsletter</h2>
            <p>Inscreva-se em nossa newsletter e seja o primeiro a receber as últimas notícias, tendências e atualizações do mundo do Desenvolvimento Web. Mantenha-se atualizado sobre os nossos produtos e serviços, além de receber ofertas exclusivas para nossos assinantes. Não perca tempo, inscreva-se agora mesmo e faça parte da nossa comunidade de informação privilegiada!</p>
            <form action="/exum">
                <input type="text" placeholder="Nome" name="name">
                <input type="email" placeholder="E-Mail" name="email">
                <input type="submit" value="Enviar >" id="send-btn" >
            </form>
  
        </aside>

        <article>   
            <img src="./components/images/white-logo.png" alt="gabuh-logo">

        </article>
    </main>
    <script src="scripts.js"></script>
</body>
</html>