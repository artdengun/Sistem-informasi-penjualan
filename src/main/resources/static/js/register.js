$('document').ready(function(){

    var password = document.getElementById("password");

    var confirmPassword = document.getElementById("confirmPassword");

    function validatePassword(){


        if(password.value != confirmPassword.value){
            confirmPassword.setCustomValidity("password tidak sama");
        }else {
            confirmPassword.setCustomValidity('');
        }

    }

    password.onchange = validatePassword;
    confirmPassword.onkeyup = validatePassword;
});