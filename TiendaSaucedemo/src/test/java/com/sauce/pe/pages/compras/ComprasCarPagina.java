package com.sauce.pe.pages.compras;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class ComprasCarPagina extends PageObject {

    @FindBy (xpath = "//button[@id='checkout']")
    protected WebElementFacade btnCheckout;

    @FindBy (xpath = "//input[@id='first-name']" )
    protected WebElementFacade txt_firtname;

    @FindBy (xpath = "//input[@id='last-name']")
    protected WebElementFacade txt_lastname;

    @FindBy (xpath = "//input[@id='postal-code']")
    protected WebElementFacade txt_postal;

    @FindBy (xpath="//input[@class='submit-button btn btn_primary cart_button btn_action']")
    protected WebElementFacade btnContinue;

    @FindBy (xpath="//button[@id='finish']")
    protected WebElementFacade btnFinish;
}
