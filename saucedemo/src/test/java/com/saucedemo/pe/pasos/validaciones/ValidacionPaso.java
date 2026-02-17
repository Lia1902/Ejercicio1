package com.saucedemo.pe.pasos.validaciones;

import com.saucedemo.pe.paginas.validaciones.ValidacionPagina;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.Step;

public class ValidacionPaso extends ValidacionPagina {

    @Step("Visualizar el titulo en el mdoulo de productos")
    public boolean VisibilidadTitulo (){
        return (tituloproductomodulo.isDisplayed());
    }

    @Step ("Validar los productos listados en el carrito de compras")
    public boolean productosListadosCarCompras (){
        for (WebElementFacade producto: listaproductosagregados){
            if (producto.isDisplayed()){
                return true;
            }
        }
        return false;
    }

    @Step ("Visualizar el titulo de descripcion general de pago")
    public boolean visibilidadtitulopago (){
        return (titulopagar.isDisplayed());
    }

    @Step ("Visualizar el mensaje de confirmacion de la compra")
    public boolean visibilidadMensajeConfir(){
        return (mensajeConfirmacionCompra.isDisplayed());
    }
}
