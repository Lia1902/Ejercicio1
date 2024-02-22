package com.sauce.pe.utilities.website;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Shared;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class WebSite {

    @Steps (shared = true)
    PageObject sauce;
    @Step ("Navegar al sitio web")
    public void navigateTo (String url){
        sauce.setDefaultBaseUrl(url);
        sauce.open();
    }
}
