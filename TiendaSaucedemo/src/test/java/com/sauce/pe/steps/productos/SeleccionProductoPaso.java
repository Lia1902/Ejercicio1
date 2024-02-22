package com.sauce.pe.steps.productos;

import com.sauce.pe.pages.productos.SeleccionProductoPagina;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.interactions.Actions;

public class SeleccionProductoPaso extends SeleccionProductoPagina {
    @Step ("Agregar productos al carrito de compras")
    public void  agregarProducto (int cantidad){
        for (int i=0; i<cantidad; i++){
            Actions act = new Actions (getDriver());
            act.click (productos.get(i)).perform();
        }
    }

    @Step("Click en el icono de carrito de compras")
    public void clickIconoCarritoCompra(){
        iconoCarCompras.click();
    }
}
