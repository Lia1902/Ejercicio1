package com.sauce.pe.steps.compras;

import com.sauce.pe.pages.compras.ComprasCarPagina;
import net.thucydides.core.annotations.Step;

public class ComprasCarPaso extends ComprasCarPagina {

    @Step("Damos click en el boton checkout")
    public void clickBtnCheckout(){
        btnCheckout.click();
    }

    @Step("Ingresar primer nombre en el formulario")
    public void ingresarPrimerNombre(String firsName){
        txt_firtname.sendKeys(firsName);
    }

    @Step("Ingresar apellido")
    public void ingresarApellido(String lastName){
        txt_lastname.sendKeys(lastName);
    }

    @Step("Ingresar codigo postal")
    public void ingresarCodigoPostal(String codigoPostal){
        txt_postal.sendKeys(codigoPostal);
    }

    @Step("Click en el boton continuar")
    public void clickBtnContinuar(){
        btnContinue.click();
    }

    @Step("Click en el boton finalizar")
    public void clickBtnFinalizar(){
        btnFinish.click();
    }

}
