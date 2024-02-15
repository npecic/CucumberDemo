Feature:  Google Search
  As a user i would like to visit www.google.com and perform a web search

  @Google
  Scenario: Google Search


    Given a user is on google web page
    When a user types in hello in the search field
    And presses search button
    Then search result page should be shown
