Feature: Visit a page and click on a link

  @test
    Scenario Outline: Visit a page and check the page title
    Given I go to url https://www.bbc.co.uk/
    When  I can log in with the following "<username>" and "<password>"


    Examples:
    |username|password|
    |srilu.koppolu@gmail.com|srilu@123|



