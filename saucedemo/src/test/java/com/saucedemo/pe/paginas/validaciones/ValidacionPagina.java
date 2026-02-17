package com.saucedemo.pe.paginas.validaciones;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

import java.util.List;

public class ValidacionPagina extends PageObject {

    @FindBy(xpath ="//span[@class='title']")
    protected WebElementFacade tituloproductomodulo;

    @FindBy (xpath = "//div[@class='inventory_item_name']")
    protected List<WebElementFacade> listaproductosagregados;

    @FindBy (xpath = "//span[@class='title']")
    protected WebElementFacade titulopagar;

    @FindBy (xpath = "//h2[@class='complete-header']")
    protected WebElementFacade mensajeConfirmacionCompra;
}
