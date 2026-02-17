@Suite @AgregarProductos
Feature: CP02 - Agregar productos al carrito de compras

  Background:
    Given el usuario navega al sitio web
    When ingresa credenciales validas

  @MayorACeroProductos
  Scenario: CP02-1 Se agrega productos al carrito exitosamente
    And agrega una cantidad determinada de productos al carrito
    And da click en el icono carrito de compras
    Then puede visualizar los productos agregados