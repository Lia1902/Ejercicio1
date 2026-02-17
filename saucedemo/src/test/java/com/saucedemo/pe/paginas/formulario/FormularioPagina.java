package com.saucedemo.pe.paginas.formulario;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class FormularioPagina extends PageObject {
    @FindBy(xpath = "//button[@id='checkout']")
    protected WebElementFacade btnCheckout;

    @FindBy (xpath = "//input[@id='first-name']")
    protected WebElementFacade txt_firstname;

    @FindBy (xpath = "//input[@id='last-name']")
    protected WebElementFacade txt_lastname;

    @FindBy (xpath="//input[@id='postal-code']")
    protected WebElementFacade txt_postalcode;

    @FindBy (xpath="//input[@id='continue']")
    protected WebElementFacade btncontinue;
}
