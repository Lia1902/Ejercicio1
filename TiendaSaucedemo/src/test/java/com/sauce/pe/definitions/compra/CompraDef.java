package com.sauce.pe.definitions.compra;

import com.sauce.pe.steps.compras.ComprasCarPaso;
import com.sauce.pe.steps.productos.SeleccionProductoPaso;
import com.sauce.pe.steps.validations.ValidationStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class CompraDef {

    @Steps (shared = true)
    SeleccionProductoPaso seleccionProducto;
    @Steps (shared = true)
    ValidationStep validate;

    @Steps (shared = true)
    ComprasCarPaso comprasCar;

    @And("agrega productos al carrito")
    public void usuarioAgregarProducto(){
        seleccionProducto.agregarProducto(2);
    }

    @And("da click en el icono de carrito")
    public void usuarioClickIconoCarCompras(){
        seleccionProducto.clickIconoCarritoCompra();
    }

    @Then("en el carrito de compras se lista los productos")
    public void sistemaListaProductos(){
        Assert.assertTrue(validate.productsAreaDisplayed());
    }

    @When("complete el formulario")
    public void usuarioFinalizaCompra(){
        comprasCar.clickBtnCheckout();
        comprasCar.ingresarPrimerNombre("Petita");
        comprasCar.ingresarApellido("Melendez");
        comprasCar.ingresarCodigoPostal("456");
        comprasCar.clickBtnContinuar();
        comprasCar.clickBtnFinalizar();
    }

    @Then("el sistema muestra un mensaje de confirmación de compra exitosa")
    public void sistemaProcesaOrden(){
        Assert.assertTrue(validate.mensajeFinalConfirmacionCompra());
    }
}
