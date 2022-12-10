Feature: Apply feature regression testing
  Scenario: Applying for admission
    Given Nu site loaded and close popup
    When Arman goes to nu site and click apply
    And Arman selects requirements for admission process
    And Arman clicks apply when popup appears
    Then Arman enter "email" for getting login link

