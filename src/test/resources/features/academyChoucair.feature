@stories
Feature: uTest
  As a user, I want to register on the platform
  @scenario1
  Scenario: Search for a automation course
    Given than Camilo wants to enter the web site uTest
    When he registers on the platform
      | strFirstNa    | strLastNa   | strMail                  | strModel       | strDevice | strSystem  | strPass   |
      | CAMILO        | Gamba       | J.CAMILOGAMBA@GMAIL.COM  | iPhone         | Apple     | iOS 14.7.1 | Camilo123 |


    Then he registers successfully