@tree
Feature: Validating the Tree page and its features

  @tree01
  Scenario: Validating the Tree page features
    Given User is logged in to HomePage
    When User clicks on the Get Started button inside Tree frame
    Then User should be navigated to Tree home page
    When User clicks on the Overview of Trees link
    Then user should be navigated to Overview of Trees page
    When User clicks on the Try Here button in Tree
    Then User should be navigated to Try Editor page

  @tree02
  Scenario Outline: Verifying valid code in the text editor 'Overview of Trees' page
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     20    |

  @tree03
  Scenario Outline: Verifying invalid code in the text editor - Overview of Trees page
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |

  @tree04
  Scenario: Validating Terminologies and its features
    When User clicks on the Terminologies link
    Then user should be navigated to Terminologies page
    When User clicks on the Try Here button in Tree
    Then User should be navigated to Try Editor page

  @tree05
  Scenario Outline: Verifying valid code in the text editor - Terminologies page
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     20    |

  @tree06
  Scenario Outline: Verifying invalid code in the text editor - Terminologies page
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |

  @tree07
  Scenario: Validating Types of Trees and its features
    When User clicks on the Types of Trees link
    Then user should be navigated to Types of Trees page
     When User clicks on the Try Here button in Tree
    Then User should be navigated to Try Editor page

  @tree08
  Scenario Outline: Verifying valid code in the text editor - Types of Trees page
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     20    |

  @tree09
  Scenario Outline: Verifying invalid code in the text editor - Types of Trees page
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |

  @tree10
  Scenario: Validating Tree Traversals and its features
    When User clicks on the Tree Traversals link
    Then user should be navigated to Tree Traversals page
    When User clicks on the Try Here button in Tree
    Then User should be navigated to Try Editor page

  @tree11
  Scenario Outline: Verifying valid code in the text editor - Tree Traversals page
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     20    |

  @tree12
  Scenario Outline: Verifying invalid code in the text editor - Tree Traversals page
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |      6    |

  @tree13
  Scenario: Validating Traversals-Illustration and its features
    When User clicks on the Traversals-Illustration link
    Then user should be navigated to Traversals-Illustration page
    When User clicks on the Try Here button in Tree
    Then User should be navigated to Try Editor page

  @tree14
  Scenario Outline: Verifying valid code in the text editor - Traversals-Illustration page
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     20    |

  @tree15
  Scenario Outline: Verifying invalid code in the text editor - Traversals-Illustration page
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |

  @tree16
  Scenario: Validating Binary Trees and its features
    When User clicks on the Binary Trees link
    Then user should be navigated to Binary Trees page
    When User clicks on the Try Here button in Tree
    Then User should be navigated to Try Editor page

  @tree17
  Scenario Outline: Verifying valid code in the text editor - Binary Trees page
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     20    |

  @tree18
  Scenario Outline: Verifying invalid code in the text editor - Binary Trees page
    When User enters an invalid python code from sheet "<Sheetname>" and <Rownumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | Rownumber |
      | PythonCode |     6     |

  @tree19
  Scenario: Validating Types of Binary Trees and its features
    When User clicks on the Types of Binary Trees link
    Then user should be navigated to Types of Binary Trees page
    When User clicks on the Try Here button in Tree
    Then User should be navigated to Try Editor page

  @tree20
  Scenario Outline: Verifying valid code in the text editor - Types of Binary Trees page
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     20    |

  @tree21
  Scenario Outline: Verifying invalid code in the text editor - Types of Binary Trees page
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |

  @tree22
  Scenario: Validating Implementation in Python and its features
    When User clicks on the Implementation in Python link
    Then user should be navigated to Implementation in Python page
    When User clicks on the Try Here button in Tree
    Then User should be navigated to Try Editor page

  @tree23
  Scenario Outline: Verifying valid code in the text editor - Implementation in Python page
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     20    |

  @tree24
  Scenario Outline: Verifying invalid code in the text editor - Implementation in Python page
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |

  @tree25
  Scenario: Validating Binary Tree Traversals and its features
    When User clicks on the Binary Tree Traversals link
    Then user should be navigated to Binary Tree Traversals page
    When User clicks on the Try Here button in Tree
    Then User should be navigated to Try Editor page

  @tree26
  Scenario Outline: Verifying valid code in the text editor - Binary Tree Traversals page
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     20    |

  @tree27
  Scenario Outline: Verifying invalid code in the text editor - Binary Tree Traversals page
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |

  @tree28
  Scenario: Validating Implementation of Binary Trees and its features
    When User clicks on the Implementation of Binary Trees link
    Then user should be navigated to Implementation of Binary Trees page
    When User clicks on the Try Here button in Tree
    Then User should be navigated to Try Editor page

  @tree29
  Scenario Outline: Verifying valid code in the text editor - Implementation of Binary Trees page
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     20    |

  @tree30
  Scenario Outline: Verifying invalid code in the text editor - Implementation of Binary Trees page
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |

  @tree31
  Scenario: Validating Applications of Binary trees and its features
    When User clicks on the Applications of Binary trees link
    Then user should be navigated to Applications of Binary trees page
   When User clicks on the Try Here button in Tree
    Then User should be navigated to Try Editor page

  @tree32
  Scenario Outline: Verifying valid code in the text editor - Applications of Binary trees page
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |    20     |

  @tree33
  Scenario Outline: Verifying invalid code in the text editor - Applications of Binary trees page
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |

  @tree34
  Scenario: Validating Binary Search Trees and its features
    When User clicks on the Binary Search Trees link
    Then user should be navigated to Binary Search Trees page
    When User clicks on the Try Here button in Tree
    Then User should be navigated to Try Editor page

  @tree35
  Scenario Outline: Verifying valid code in the text editor - Binary Search Trees page
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     20    |

  @tree36
  Scenario Outline: Verifying invalid code in the text editor - Binary Search Trees page
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |

  @tree37
  Scenario: Validating Implementation Of BST and its features
    When User clicks on the Implementation Of BST link
    Then user should be navigated to Implementation Of BST page
    When User clicks on the Try Here button in Tree
    Then User should be navigated to Try Editor page

  @tree38
  Scenario Outline: Verifying valid code in the text editor - Implementation Of BST page
    When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an valid output

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |    20     |

  @tree39
  Scenario Outline: Verifying invalid code in the text editor - Implementation Of BST page
    When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
    Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |    6      |
