package com.saucedemo.pe.definiciones.producto;

import com.saucedemo.pe.pasos.productos.SeleccionProductoPaso;
import com.saucedemo.pe.pasos.validaciones.ValidacionPaso;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class ProductoAgregadosDef {

    @Steps(shared = true)
    SeleccionProductoPaso SeleccionProducto;
    @Steps (shared = true)
    ValidacionPaso validate;

    @And("agrega una cantidad determinada de productos al carrito")

    public void usuarioAgregaProductos(){
        SeleccionProducto.agregarProductos(2);
    }

    @And("da click en el icono carrito de compras")

    public void usuarioClickCarCompras(){
        SeleccionProducto.clickIconoCarCompras();
    }

    @Then("puede visualizar los productos agregados")
    public void sistemaListaProductos (){
        Assert.assertTrue(validate.productosListadosCarCompras());
    }
}
