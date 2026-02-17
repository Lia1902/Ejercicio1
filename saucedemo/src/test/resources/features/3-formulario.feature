@Suite @Formulario
Feature: CP03 - Ingreso da datos en formulario de compra
  Background:
    Given el usuario navega al sitio web
    When ingresa credenciales validas
    And agrega una cantidad determinada de productos al carrito
    And da click en el icono carrito de compras
    Then puede visualizar los productos agregados

  @RegistroFormularioExitoso
  Scenario: CP03 - 01 Ingreso de datos exitoso en el formulario
    And click en el boton checkout
    When completa datos del formulario correctamente
    Then el sistema muestra información del pago