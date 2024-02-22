package com.sauce.pe.steps.Login;

import com.sauce.pe.pages.login.LoginPage;
import net.thucydides.core.annotations.Step;

public class LoginStep extends LoginPage {

    @Step ("Ingresar usuario")
    public void typeUsername (String username){
        txt_username.sendKeys(username);
    }

    @Step ("Ingresar clave")
    public void typePassword (String password){
        txt_password.sendKeys(password);
    }

    @Step ("Click en el boton Login")
    public void clickLogin (){
        btn_login.click();
    }
}
