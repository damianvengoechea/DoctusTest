Feature: Start sesion on the EUNO platform.
  I as a user
  I wish to start sesion on the euno platform
  to start the page

  Scenario: wrong email and password
    Given that Damian is on the page euno
    When start sesion with email ldsdamian@hotmail.com, pass 123456789
    Then the reply message will be Usuario o contraseña inválidos

