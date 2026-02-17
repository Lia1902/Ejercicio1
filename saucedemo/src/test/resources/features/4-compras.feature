@Suite @Compras
Feature: CP04 - Validar la finalizacion de la compra
  Background:
    Given el usuario navega al sitio web
    When ingresa credenciales validas
    And agrega una cantidad determinada de productos al carrito
    And da click en el icono carrito de compras
    Then puede visualizar los productos agregados
    And click en el boton checkout
    When completa datos del formulario correctamente
    Then el sistema muestra información del pago


  @CompraExitosa
  Scenario: CP04 - 01 Ingreso de datos exitoso en el formulario
    When click en el boton finish
    Then el sistema muestra un mensaje de confirmacion por la compra