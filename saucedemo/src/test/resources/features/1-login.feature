@Suite @Login
Feature: CP01 - Validacion de autenticacion de usuario y clave

  Background:
    Given el usuario navega al sitio web

  @CredencialesValidas
  Scenario: CP01-01: Validacion con credenciales validas
    When ingresa credenciales validas
    Then el sistema muestra el modulo principal de productos

