# junit5-tagging-demo
demo project for tagging/filtering JUnit Jupiter (JUnit 5) with Maven

## overview
this demo project shows how to selectively tag and filter JUnit Jupiter unit tests. tagging is accomplished with [JUnit Tagging](https://junit.org/junit5/docs/current/user-guide/#writing-tests-tagging-and-filtering) and test execution is handled by the [Maven Surefire Plugin](https://junit.org/junit5/docs/current/user-guide/#running-tests-build-maven). 

tagging your unit tests is useful if you are running them as integration tests and/or part of an automation test suite. like the [unit tests in this project](https://github.com/7ravis/junit5-tagging-demo/blob/main/src/test/java/com/example/junit5taggingdemo/Junit5TaggingDemoApplicationTests.java), you could tag tests by environment, status (e.g. "wip"), speed, and/or automation test inclusion (e.g. "smoke"). 

## execution examples
NOTE: examples below were originally run using [git bash on windows](https://gitforwindows.org/). you may need to modify based on your

in this demo project, you could run just the unit tests tagged for the "tst" environment with
`./mvnw test -Dtags="tst"`

to exclude anything tagged with "wip"
`./mvnw test -Dtags="tst" -Dexclude-tags="wip"`

to also include the tests tagged with "stg"
`./mvnw test -Dtags="tst | stg" -Dexclude-tags="wip"`

read more about tag expressions [here](https://junit.org/junit5/docs/current/user-guide/#running-tests-tag-expressions).

## steps to add tagging to your project
1. ensure you are using JUnit Jupiter (JUnit 5). this demo is not for JUnit 4.
1. tag your unit tests. see [example](https://github.com/7ravis/junit5-tagging-demo/blob/main/src/test/java/com/example/junit5taggingdemo/Junit5TaggingDemoApplicationTests.java).
1. configure your pom.xml file. see [example](https://github.com/7ravis/junit5-tagging-demo/blob/main/pom.xml), specifically the properties and the build plugin config for Maven Surefire.

## considerations
I chose to pass the tags as variables because I can run new tag combinations without needing to modify the pom.xml file, but for a non-demo project, you may find yourself configuring tags by Maven Profile or some combination of both strategies.
