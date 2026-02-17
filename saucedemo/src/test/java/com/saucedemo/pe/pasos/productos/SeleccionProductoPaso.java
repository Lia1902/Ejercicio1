package com.saucedemo.pe.pasos.productos;

import com.saucedemo.pe.paginas.productos.SeleccionProductoPagina;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.Actions;

public class SeleccionProductoPaso extends SeleccionProductoPagina {

    @Step("Agregar productos al carrito de compras")
    public void agregarProductos (int cantidad){
        for (int i=0; i<cantidad; i++){
            Actions act = new Actions (getDriver());
            act.click (productos.get(i)).perform();
        }
    }

    @Step ("Click en el icono del carrito de compras")
    public void clickIconoCarCompras (){
        iconoCarCompras.click();
    }
}
