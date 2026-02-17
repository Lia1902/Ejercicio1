package com.saucedemo.pe.definiciones.formulario;

import com.saucedemo.pe.pasos.formulario.FormularioPaso;
import com.saucedemo.pe.pasos.validaciones.ValidacionPaso;
import com.saucedemo.pe.utilities.website.WebSite;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class FormularioDef {

    @Steps(shared = true)
    WebSite url;

    @Steps (shared = true)
    FormularioPaso formPaso;

    @Steps (shared = true)
    ValidacionPaso validate;

    @And("click en el boton checkout")
    public void usuarioClickBtnCheckout (){
        formPaso.clickBtnCheckout();
    }

    @When("completa datos del formulario correctamente")
    public void usuarioCompletarDatosForm (){
        formPaso.ingresarPrimerNombre("Petita");
        formPaso.ingresarApellido("Melendez");
        formPaso.ingresarCodigoPostal("310");
        formPaso.clickBtnContinuar();
    }

    @Then("el sistema muestra información del pago")
    public void usuarioVisualizaTituloPago(){
        Assert.assertTrue(validate.visibilidadtitulopago());
    }
}
