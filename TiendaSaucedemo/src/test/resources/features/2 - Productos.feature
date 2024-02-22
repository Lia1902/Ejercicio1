@Suite @ComprasEnLinea
Feature: CP02 - Validar carrito de compras
  Background:
    Given el usuario navega al sitio web
    When ingresa credenciales validas

@CompraAgregarProductos
  Scenario: 1 - Se agrega los productos al carrito exitosamente
    And agrega productos al carrito
    And da click en el icono de carrito
    Then en el carrito de compras se lista los productos

  @CompraExitosa
  Scenario: 2 - Se muestra mensaje de confirmacion al finalizar la compra
    And agrega productos al carrito
    And da click en el icono de carrito
    When complete el formulario
    Then el sistema muestra un mensaje de confirmación de compra exitosa
