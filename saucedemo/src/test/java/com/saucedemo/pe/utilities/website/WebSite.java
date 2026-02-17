package com.saucedemo.pe.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {

    @Steps(shared = true)
    PageObject saucedemo;

    @Step("Navegar al sitio web")
    public void navegarAlSitio (String url){
        saucedemo.setDefaultBaseUrl(url);
        saucedemo.open();
    }
}
