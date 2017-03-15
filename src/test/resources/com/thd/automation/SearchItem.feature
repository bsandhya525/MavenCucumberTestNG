Feature: These Scenarios are for searching items in THD page.
  @runThis
  Scenario Outline: Search for item and validate landing page contains item
    Given I navigate to the Home Depot page
    When i enter <item> in the search box and click the search button
    Then i should land on the <validation> landing page
 
 Examples:
 |item  |validation|
 |hammer|hammer    |
 |nail  |nail      |
 |screwdriver|screwdriver|
