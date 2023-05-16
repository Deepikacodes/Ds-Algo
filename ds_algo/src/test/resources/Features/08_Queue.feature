@queue
Feature: Validating the Queue page and its features

  @queue01
  Scenario: Validating the Queue page features
    Given User is logged in to HomePage
    When User clicks on the Get Started button inside Queue frame
    Then User should be navigated to Queue home page
    When User clicks on the Implementation of Queue in Python link
    Then user should be navigated to Implementation of Queue in Python page
    When User clicks on the Try Here button in queue
    Then User should be navigated to Try Editor page

  @queue02
  Scenario Outline: Verifying valid code in the text editor 'Implementation of Queue' in Python
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     19    |

  @queue03
  Scenario Outline: Verifying invalid code in the text editor - Implementation of Queue in Python
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |    6      |

  @queue04
  Scenario: Validating 'Implementation using collections.deque' and its features
    When User clicks on the Implementation using collections.deque link
    Then user should be navigated to Implementation using collections.deque page
    When User clicks on the Try Here button in queue
    Then User should be navigated to Try Editor page

  @queue05
  Scenario Outline: Verifying valid code in the text editor - Implementation using collections.deque
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     19    |

  @queue06
  Scenario Outline: Verifying invalid code in the text editor - Implementation using collections.deque
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |

  @queue07
  Scenario: Validating 'Implementation using array' and its features
    When User clicks on the Implementation using array link
    Then user should be navigated to Implementation using array page
    When User clicks on the Try Here button in queue
    Then User should be navigated to Try Editor page

  @queue08
  Scenario Outline: Verifying valid code in the text editor 'Implementation using array'
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |    19     |

  @queue09
  Scenario Outline: Verifying invalid code in the text editor 'Implementation using array'
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |

  @queue10
  Scenario: Validating Queue Operations and its features
    When User clicks on the Queue Operations link
    Then user should be navigated to Queue Operations page
    When User clicks on the Try Here button in queue
    Then User should be navigated to Try Editor page

  @queue11
  Scenario Outline: Verifying valid code in the text editor 'Implementation using array'
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     19    |

  @queue12
  Scenario Outline: Verifying invalid code in the text editor 'Implementation using array'
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |
