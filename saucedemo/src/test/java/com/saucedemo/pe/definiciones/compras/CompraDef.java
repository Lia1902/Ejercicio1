package com.saucedemo.pe.definiciones.compras;

import com.saucedemo.pe.pasos.compras.CompraPaso;
import com.saucedemo.pe.pasos.formulario.FormularioPaso;
import com.saucedemo.pe.pasos.validaciones.ValidacionPaso;
import com.saucedemo.pe.utilities.website.WebSite;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class CompraDef {

    @Steps(shared = true)
    WebSite url;

    @Steps (shared = true)
    CompraPaso ComPaso;

    @Steps (shared = true)
    ValidacionPaso validate;

    @When("click en el boton finish")
    public void usuarioClickBtnFinish(){
        ComPaso.clickBtnFinish();
    }

    @Then("el sistema muestra un mensaje de confirmacion por la compra")
    public void usuarioVisualizaMensajeConfirmacion(){
        Assert.assertTrue(validate.visibilidadMensajeConfir());
    }
}
