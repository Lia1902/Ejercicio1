package com.sauce.pe.definitions;

import com.sauce.pe.steps.Login.LoginStep;
import com.sauce.pe.steps.validations.ValidationStep;
import com.sauce.pe.utilities.website.WebSite;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class LoginDef {
    @Steps(shared = true)
    WebSite url;

    @Steps(shared = true)
    LoginStep login;

    @Steps(shared = true)
    ValidationStep validate;

    @Given("el usuario navega al sitio web")
    public void userNavigateTo (){
        url.navigateTo ( "https://www.saucedemo.com/");
    }

    @When("ingresa credenciales validas")
    public void userLoginWithValidCredentials (){
        login.typeUsername("standard_user");
        login.typePassword("secret_sauce");
        login.clickLogin();
    }

    @Then("la aplicacion mostrara el modulo principal de productos")
    public void systemShowProductModule(){
        Assert.assertTrue(validate.titleVisible());
    }

    @When("ingresa credenciales invalidas")
    public void userLoginWithInvalidCredentials (){
        login.typeUsername("standard_user");
        login.typePassword("nonoi");
        login.clickLogin();
    }

    @Then("la aplicacion mostrara mensaje de error")
    public void systemErrorShowMessage(){
        Assert.assertTrue(validate.errorMessageIsDisplayed());
    }
}
