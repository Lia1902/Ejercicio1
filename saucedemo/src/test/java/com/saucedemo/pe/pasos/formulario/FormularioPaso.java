package com.saucedemo.pe.pasos.formulario;

import com.saucedemo.pe.paginas.formulario.FormularioPagina;
import net.thucydides.core.annotations.Step;

public class FormularioPaso extends FormularioPagina {
    @Step("click en el boton checkout")
    public void clickBtnCheckout (){
        btnCheckout.click();
    }

    @Step ("Ingresar el primer nombre")
    public void ingresarPrimerNombre (String primernombre){
        txt_firstname.sendKeys(primernombre);
    }

    @Step ("Ingresar el apellido")
    public void ingresarApellido (String apellido){
        txt_lastname.sendKeys(apellido);
    }

    @Step ("Ingresar el codigo postal")
    public void ingresarCodigoPostal (String codigopostal){
        txt_postalcode.sendKeys(codigopostal);
    }

    @Step ("Click en el boton continue")
    public void clickBtnContinuar (){
        btncontinue.click();
    }
}
