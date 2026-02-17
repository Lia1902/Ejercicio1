package com.saucedemo.pe.paginas.compras;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CompraPagina extends PageObject {

    @FindBy(xpath = "//button[@id='finish']")
    protected WebElementFacade btnFinish;
}
