const password = document.getElementById('password');
const icon = document.getElementById('icon');


function showHide(){
    if(password.type === 'password'){
        password.setAttribute('type','text');
        icon.classList.add('hide')
    }
    else{
        password.setAttribute('type', 'password');
        icon.classList.remove('hide')
    }
}

const password1 = document.getElementById('password1');
const icon1 = document.getElementById('icon1');

function showHide1(){
    if(password1.type === 'password'){
        password1.setAttribute('type','text');
        icon1.classList.add('hide')
    }
    else{
        password1.setAttribute('type', 'password');
        icon1.classList.remove('hide')
    }
}

const password2 = document.getElementById('password2');
const icon2 = document.getElementById('icon2');

function showHide2(){
    if(password2.type === 'password'){
        password2.setAttribute('type','text');
        icon2.classList.add('hide')
    }
    else{
        password2.setAttribute('type', 'password');
        icon2.classList.remove('hide')
    }
}