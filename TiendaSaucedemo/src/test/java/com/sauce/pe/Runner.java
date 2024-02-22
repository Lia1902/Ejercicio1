package com.sauce.pe;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        features = "src/test/resources/features",
        glue = "com.sauce.pe.definitions",
        tags = "@ComprasEnLinea and @CompraExitosa"
)
public class Runner {
}
