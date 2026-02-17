package com.saucedemo.pe.paginas.login;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPagina extends PageObject {

    @FindBy(xpath = "//input[@id = 'user-name']")
    protected WebElementFacade txt_username;

    @FindBy (xpath = "//input[@id='password']")
    protected WebElementFacade txt_password;

    @FindBy (xpath = "//input[@id='login-button']")
    protected WebElementFacade btnLogin;
}
