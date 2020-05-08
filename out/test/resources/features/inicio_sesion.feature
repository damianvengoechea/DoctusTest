Feature: Start sesion on the EUNO platform.
  I as a user
  I wish to start sesion on the euno platform
  to start the page

  Scenario: wrong email and password
    Given that Damian is on the page euno
    When start sesion with email <email>, pass <pass>
    Then the reply message will be Usuario o contraseña inválidos

