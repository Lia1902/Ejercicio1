package com.saucedemo.pe.definiciones.login;

import com.saucedemo.pe.pasos.login.LoginPaso;
import com.saucedemo.pe.pasos.validaciones.ValidacionPaso;
import com.saucedemo.pe.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDef {

    @Steps (shared = true)
    WebSite url;
    @Steps (shared = true)
    LoginPaso Login;
    @Steps(shared = true)
    ValidacionPaso validate;

    @Given("el usuario navega al sitio web")

    public void usuarioNavegarAlSitio (){
        url.navegarAlSitio("https://www.saucedemo.com/");
    }

    @When("ingresa credenciales validas")
    public void ingresarCredencialesValidas (){
        Login.ingresarUsername ("standard_user");
        Login.ingresarPasswoord("secret_sauce");
        Login.clickBtnLogin();
    }

    @Then("el sistema muestra el modulo principal de productos")
    public void sistemaMuestraTituloProducto (){
        Assert.assertTrue(validate.VisibilidadTitulo());
    }
}


