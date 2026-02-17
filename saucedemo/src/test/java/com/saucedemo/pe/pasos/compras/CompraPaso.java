package com.saucedemo.pe.pasos.compras;

import com.saucedemo.pe.paginas.compras.CompraPagina;
import net.thucydides.core.annotations.Step;

public class CompraPaso extends CompraPagina {

    @Step("Click en el boton finish")
    public void clickBtnFinish (){
        btnFinish.click();
    }
}
