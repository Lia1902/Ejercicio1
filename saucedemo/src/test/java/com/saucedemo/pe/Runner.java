package com.saucedemo.pe;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
       features = "src/test/resources/features",
      glue = "com.saucedemo.pe.definiciones",
      tags = "@Login or @AgregarProductos or @Formulario or @Compras"
)

public class Runner {
}
