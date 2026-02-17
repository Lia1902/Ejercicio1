package com.saucedemo.pe.paginas.productos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class SeleccionProductoPagina extends PageObject {

    @FindBy(xpath = "//button[@class = 'btn btn_primary btn_small btn_inventory ']")
    protected List<WebElementFacade> productos;

    @FindBy (xpath = "//a[@class = 'shopping_cart_link']")
    protected WebElementFacade iconoCarCompras;
}
