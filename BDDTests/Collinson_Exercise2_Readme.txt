# Exercise2- API Automation

This exercise has been automated using Java

###prerequisite####

Latest Version of Java, Maven


## Installation
Exercise 2 Tests the CityBike API

Tested and developed on Java
Supported libraries:

Cucumber
Junit
Rest Assured

### Files available

This is a Maven Project(BDDTests) . Designed for BDD Test Automation of CityBike API Module

The pom.xml file has all the dependencies for the project

BDDTests-->src/test/java-->com.collinson.BDDTests.features.Citybik.feature
BDDTests-->src/test/java-->com.collinson.BDDTests.StepDefinition.CitybikStepDefinition
BDDTests-->src/test/java-->com.collinson.BDDTests.SupportLib.CitybikData
BDDTests-->src/test/java-->com.collinson.BDDTests.SupportLib.CitybikStepRestImpl
BDDTests-->src/test/java-->com.collinson.BDDTests.SupportLib.RestConstants
BDDTests-->src/test/java-->com.collinson.BDDTests.TestRunner

## Usage

Unzip the folder Exercise2

####Execute the maven command from the path Exercise2/BDDTests/

mvn test

###Command to execute the BDD tests from the path Exercise2/BDDTests/

mvn exec:java -Dexec.classpathScope=test -Dexec.mainClass=io.cucumber.core.cli.Main -Dexec.args="src/test/java/com/collinson/BDDTests/features --glue com.collinson.BDDTests.StepDefinition"

