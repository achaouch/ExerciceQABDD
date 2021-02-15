### ExerciceQABDD

This repository contains a collection of sample `selenium-cucumber-java` projects and libraries to test google search functionality automation script using the Cucumber (v 5.7.0) BDD framework with Java as programming language. It generate Allure, HTML and JSON reporters as well. It also generate `screen shots` for your tests if you enable it and also generate `error shots` for your failed test cases as well.

### Installation (pre-requisites)
1. JDK 1.8+ (make sure Java class path is set)
2. Maven (make sure .m2 class path is set)
3. Eclipse
4. Eclipse Plugins for
    - Maven
    - Cucumber

### Framework set up
Fork / Clone repository from [here]( https://github.com/achaouch/ExerciceQABDD) or download zip and set it up in your local workspace.

### Run Test
Open terminal (MAC OSX) or command prompt / power shell (for windows OS) and navigate to the project directory
type `mvn clean test` command to run features. With this command it will invoke the default chrome browser and will execute the tests.

### Reporters
Once you ran your tests you can generate the various types of reports. This framework `ExerciceQABDD` uses several different types of test reporters to communicate pass/failure.

##### Allure Report:
You can generate a report using one of the following command under \allure-result:
- `allure serve {path/allure-result}`

##### HTML Report:
 HTML report under "\CucumberJava\target\HtmlReports\index.html"

##### JSON Report:
JSON report "\CucumberJava\target\JSONReports"`

### The Page Object Design Pattern
A Page Object simply models these as objects within the test code. This reduces the amount of duplicated code and means that if the UI changes, the fix need only be applied in one place. 
