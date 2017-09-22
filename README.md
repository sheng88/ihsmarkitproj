### Overview

This workspace contains only one class, com.ihsmarkit.assignment.FindPalindromes, which allows user to find all palindromes for a given string. The class source file is located under src/main/scala. It's associated ScalaTest class com.ihsmarkit.assignment.FindPalindromesSpec can be found under the corresponding test folder src/test/scala. To successfully compile this project, your computer must satisfy the following system requirements.

### System Requirements:
1) Java JDK 1.8.0
2) Scala 2.12.1
3) SBT 1.0.2

Before running the program, the above software packages should have been properly installed on your computer. Their respective environment variables, such as JAVA_HOME, SCALA_HOME, and SBT_HOME, should also have been updated to the computer's environment properties. 

### How to run

1) Clone this repository to your local director.
2) Open your command prompt utility tool, then navigate to the root directory of the project.
3) To compile the project, run > sbt compile
4) After the project has been successfully compiled, you may run the application by entering > sbt run MYTESTSTRING, where MYTESTSTRING is a sample string which you want to find palindromes for.
5) To test the class, run > sbt test. This command will execute all test cases specified in the ScalaTest class com.ihsmarkit.assignment.FindPalindromesSpec.

Please contact me if you encounter any issues. My email is to_sheng@hotmail.com.
