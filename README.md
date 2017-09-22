## ihsmarkitproj

This workspace contains only one class ###com.ihsmarkit.assignment.FindPalindromes###, which can find and return all palindromes of a given string.
The class source file is located under src/main/scala. It's associated ScalaTest class com.ihsmarkit.assignment.FindPalindromesSpec ### can be found under the corresponding test folder src/test/scala.
To successfully compile this project, your computer must satisfies the following system requirements.

### System Requirements:

The following should have been installed and configured on your computer prior to building the workspace.

1) Java JDK 1.8.0
2) Scala 2.12.3
3) SBT 1.0.2


### How to run

1) Check out the project to your local director.
2) Open your command prompt tool and navigate to the root directory of the project.
3) To compile the project, run sbt compile
4) If compilation is successful, you may run the application by entering sbt run MYTESTSTRING, where MYTESTSTRING is the string you would like to find palindromes for.
5) To test the class, run sbt test. This command will execute all test cases specified in com.ihsmarkit.assignment.FindPalindromesSpec.
