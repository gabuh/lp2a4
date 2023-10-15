
const registerButton = document.getElementById("register-button");
registerButton.addEventListener('click', (event) => {
    const email = document.getElementById('email');
    const password = document.getElementById('password');
    const name  = document.getElementById('fname')


    if(email.value == ''){
        email.classList.add('errorInput');
        event.preventDefault();
    }else{
        email.classList.remove('errorInput');

    }
    if(password.value == ''){
        password.classList.add('errorInput');
        event.preventDefault();
    }else {
        password.classList.remove('errorInput');
    }
    if(name.value == ''){
        event.preventDefault();
        name.classList.add('errorInput');
    }else {
        name.classList.remove('errorInput');
    }

    if (email.value.indexOf("@") == -1 || email.value.indexOf(".") == -1 || (email.value.indexOf(".") - email.value.indexOf("@") == 1) ){
        email.classList.add('errorInput');
        event.preventDefault();
    }else{
        email.classList.remove('errorInput');
    }

    if (password.value.length <= 8){
        event.preventDefault();
        password.classList.add('errorInput');
    }else{
        password.classList.remove('errorInput');
    }
    if (name.value.length <= 5){
        event.preventDefault();
        name.classList.add('errorInput');
    }else{
        name.classList.remove('errorInput');
    }




})