@Suite @Login
Feature: CP01 - Validar inicio de sesion
  Background:
    Given el usuario navega al sitio web

    @CredencialesValidas
    Scenario: 1 - Validar con credenciales validas
      When ingresa credenciales validas
      Then la aplicacion mostrara el modulo principal de productos

    @CredencialesInvalidas
    Scenario: 2 - Validar con credenciales invalidas
        When ingresa credenciales invalidas
        Then la aplicacion mostrara mensaje de error
