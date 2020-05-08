Feature: Registration on the EUNO platform.
  I as a user
  I wish to register on the euno platform
  to start the training

  Scenario: Registration on with non-corporate mail the platform
    Given that Damian is on the page the register euno
    When register with name damian, lastname vengoechea, document 12345678, email ldsdamian@hotmail.com,password 123456
    Then the log message should be Lo sentimos, el correo electrónico ingresado no está autorizado para el registro.
