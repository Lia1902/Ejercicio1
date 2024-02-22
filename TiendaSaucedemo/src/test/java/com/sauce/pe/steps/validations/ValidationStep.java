package com.sauce.pe.steps.validations;

import com.sauce.pe.pages.validations.ValidationPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ValidationStep extends ValidationPage {

   @Step ("Visualizar el modulo de productos")
    public boolean titleVisible (){
        return lbl_product.isDisplayed();
    }

    @Step ("Visualizar mensaje de error")
    public boolean errorMessageIsDisplayed (){
        return lbl_errorMessage.isDisplayed();
    }

    @Step ("Validar los productos listados en el carrito de compras")
    public boolean productsAreaDisplayed (){
       for (WebElementFacade producto:listaproductos){
           if (producto.isDisplayed()){
               return true;
           }
        }
        return false;
    }

    @Step ("Visualizar mensaje de confirmacion de compra")
    public boolean mensajeFinalConfirmacionCompra (){
        return mensajeFinalCompra.isDisplayed();
    }

}
