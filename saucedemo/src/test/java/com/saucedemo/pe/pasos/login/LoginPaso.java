package com.saucedemo.pe.pasos.login;

import com.saucedemo.pe.paginas.login.LoginPagina;

public class LoginPaso extends LoginPagina {

    public void ingresarUsername (String username){
        txt_username.sendKeys(username);
    }

    public void ingresarPasswoord (String password){
        txt_password.sendKeys(password);
    }

    public void clickBtnLogin (){
        btnLogin.click();
    }
}
