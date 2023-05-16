@list
Feature: Validating the LinkedList page and its features

@linkedlist01 
Scenario: Validating the Linked List page features
Given User is logged in to HomePage
When User clicks on the Get Started button inside LinkedList frame
Then User should be navigated to Linked List home page
When User clicks on the Introduction link
Then user should be navigated to Linked lists introduction page
When User clicks on the Try Here button in Linked List
Then User should be navigated to Try Editor page


## common gherkin for valid and invalid python code
## Introduction
@linkedlist02 
Scenario Outline: Verifying valid code in the text editor - Intro page
When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
Then User should get an valid output

 Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |       12 |

@linkedlist03 
Scenario Outline: Verifying invalid code in the text editor - Intro page
When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
Then User should get an popup alert

    Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         6 |

@linkedlist04 
Scenario: Validating 'Creating Linked List' link and its features
When User clicks on the Creating Linked List link
Then user should be navigated to Creating Linked List page

When User clicks on the Try Here button in Linked List
Then User should be navigated to Try Editor page

## Creating Linked List - Try Editor
@linkedlist05
Scenario Outline: Verifying valid code in the text editor in 'Creating Linked List'  page
When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
Then User should get an valid output

 Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |    13     |

@linkedlist06
Scenario Outline: Verifying invalid code in the text editor in 'Creating Linked List'  page
When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
Then User should get an popup alert

 Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |         6 |

##Types of Linked List
@linkedlist07
Scenario: Validating 'Types of Linked List' link and its features
When User clicks on the Types of Linked List link
Then User should be navigated to Types of Linked List
When User clicks on the Try Here button in Linked List
Then User should be navigated to Try Editor page

## Types of Linked List page - Try Editor
@linkedlist08
Scenario Outline: Verifying valid code in the text editor in 'Types of Linked List'  page
When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
Then User should get an valid output

 Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |    14     |

@linkedlist09
Scenario Outline: Verifying invalid code in the text editor in Types of Linked List -  page
When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
Then User should get an popup alert

 Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |

## Implement Linked List in Python
@linkedlist10
Scenario: Validating 'Implement Linked List in Python' link and its features
When User clicks on Implement Linked List in Python link
Then User should be navigated to Implement Linked List in Python page
When User clicks on the Try Here button in Linked List
Then User should be navigated to Try Editor page

## Implement Linked List in Python page - Try Editor
@linkedlist11
Scenario Outline: Verifying valid code in the text editor in 'Implement Linked List in Python' page
When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
Then User should get an valid output
 Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     15    |
      
@linkedlist12
Scenario Outline: Verifying invalid code in the text editor in 'Implement Linked List in Python' page
When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
Then User should get an popup alert
 Examples: 
      | Sheetname  | RowNumber |
      | pythoncode |     6     |

## Traversal
@linkedlist13
Scenario: Validating 'Traversal' link and its features
When User clicks on the Traversal link
Then User should be navigated to Traversal page
When User clicks on the Try Here button in Linked List
Then User should be navigated to Try Editor page

## Traversal page - Try Editor
@linkedlist14
Scenario Outline: Verifying valid code in the text editor in 'Traversal' page
When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
Then User should get an valid output

 Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     16    |
      
@linkedlist15
Scenario Outline: Verifying invalid code in the text editor in Traversal page
When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
Then User should get an popup alert

 Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |

## Insertion
@linkedlist16
Scenario: Validating 'Insertion' link and its features
When User clicks on the Insertion link
Then User should be navigated to Insertion page
When User clicks on the Try Here button in Linked List
Then User should be navigated to Try Editor page

## Insertion page - Try Editor
@linkedlist17
Scenario Outline: Verifying valid code in the text editor in 'Insertion' page
When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
Then User should get an valid output

 Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     17    |

@linkedlist18
Scenario Outline: Verifying invalid code in the text editor in Insertion page
When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
Then User should get an popup alert

 Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |     6     |
      
## Deletion
@linkedlist19
Scenario: Validating 'Deletion' link and its features
When User clicks on the Deletion link
Then User should be navigated to Deletion page
When User clicks on the Try Here button in Linked List
Then User should be navigated to Try Editor page

## Deletion page - Try Editor
@linkedlist20
Scenario Outline: Verifying valid code in the text editor in 'Deletion' page
When User enters a valid python code from sheet "<Sheetname>" and <RowNumber>
Then User should get an valid output

 Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |      18   |

@linkedlist21
Scenario Outline: Verifying invalid code in the text editor in 'Deletion' page
When User enters an invalid python code from sheet "<Sheetname>" and <RowNumber>
Then User should get an popup alert
 Examples: 
      | Sheetname  | RowNumber |
      | PythonCode |    6      |

