# Autor: Daniel Insuasti Caballero

@stories
Feature: Academy Choucair
  As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
  @scenario1
  Scenario Outline: Search for a automation course
    Given than client wants to learn automation at the Choucair academy
    | strUser     | strPassword   |
    | <strUser>   | <strPassword> |
    When he search for the course on the Choucair academy platform
    | strCourse                 |
    | <strCourse>               |
    Then he finds the course called
    | strCourse   |
    | <strCourse> |

    Examples:
    | strUser     | strPassword   | strCourse                             |
    | 1088267615  | Choucair2021* | Prueba Técnica - Analista Bancolombia |