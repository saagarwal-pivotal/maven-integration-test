
# How to run integration test in spring boot maven. Why my integration tests are not getting picked up?

You can run unit tests by running the following command at the command prompt:

    mvn clean test


You can run all tests by running the following command at the command prompt:

     mvn clean verify

You can run the full build (that runs all unit tests) by running the following command at the command prompt:

    mvn clean package

## Failsafe plugin for running integration test.

You can include integration test classes also exclude unit test classes
and set skipTest to false and add goals
where you want the integration tests to kick in.
You are all set.

Without this plugin all your tests ending with *IT.java are ignored.

```
    <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-failsafe-plugin</artifactId>
        <version>2.19</version>
        <configuration>
            <!-- without these flag to false integration tests are not being picked up -->
            <skipTests>false</skipTests>
            <includes>
                <include>**/*IT.java</include>
            </includes>
        </configuration>
        <executions>
            <execution>
                <goals>
                    <goal>integration-test</goal>
                    <goal>verify</goal>
                </goals>
            </execution>
        </executions>
    </plugin>
```

# Maven Build scan Plugin

A build scan is a shareable record of a build that provides insights into what happened and why. You can create a build scan at scans.gradle.com for the Gradle and Maven build tools for free.

Add below file extensions.xml to .mvn folder of project.

For more information of build scan please refer 
https://guides.gradle.org/creating-build-scans/


```
<!-- Add this to extensions.xml file and put in .mvn of project folder -->

<?xml version="1.0" encoding="UTF-8"?>
<extensions>
  <extension>
    <groupId>com.gradle</groupId>
    <artifactId>gradle-enterprise-maven-extension</artifactId>
    <version>1.0.2</version>
  </extension>
</extensions>


mvn clean install
```

