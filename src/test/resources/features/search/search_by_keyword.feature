Feature: Buy a product in the store

  Scenario Template: Successful logIn
    Given that Anto go to Store
    When Anto select SignIn button
    And Anto input the following email address and password: <email>, <pass>
    Then Anto have to see the title: MY ACCOUNT

    Examples:
      |email              |pass  |
      |antitomorano@gmail.com|antito|


  Scenario: Successful purchase
    Given that Anto go to Store
    When Anto add to cart one product
    And Anto proceed to checkout
    And Anto pass summary page
    And Anto logIn into Store with email: antitomorano@gmail.com and password: antito
    And Anto pay the purchase
    Then Anto have to see the following message: Your order on My Store is complete.