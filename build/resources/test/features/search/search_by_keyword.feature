Feature: Search by keyword

  Scenario: Searching for a term
    Given Sergey is on the wordpress opensourcecms login page
    When he introduce his user "opensourcecms"
    Then he introduce his password "opensourcecms"
    Then he press the button log in
    And he press the button Posts
    And he press the button Add New of Posts module
    Then he type the Post title "Hello World"
    Then he press the button Publish of Posts module
    Then he press the button to Publish the Posts
    And Sergey press the button to View the Post and see the title "Hello World"