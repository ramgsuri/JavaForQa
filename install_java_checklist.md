# Generic Java Install checklist

*Basic steps:*

- Install Java and supporting tools
    - install Java JDK
    - install Maven
    - check Java and Maven work by running a sample test
- Install IntelliJ
    - check IntelliJ works by running the sample test
        
This checklist contains instructions for Windows and Mac.

## Install Java Pre-requisites

*  Check what you need to install by typing console commands : 
    *  javac -version
          - if it fails then you need to install a Java JDK
    *  mvn -version
          - if it fails then you need to install maven
          

---

# For Mac Install Java checklist
## Use HomeBrew to install Java JDK and Maven

*  install homebrew from http://brew.sh/
*  Run this command : `brew update` 
*  Install jdk with : `brew cask install java`
*  Install maven with : `brew install maven`

---

* If everything is installed, check the environment variables by displaying them on the console
    * For Mac type : 
        * `echo $JAVA_HOME`
        * `echo $PATH`

---

* Download JUnit Test Project (this has a simple pom.xml and a basic test to run)
    *  Visit this url : https://github.com/ramgsuri/JavaForQa.git
    *  Download the zip file and unzip somewhere

*  run my first test from the command line
    *  use the command line to "cd" to the directory you unarchived the source code to
    * Run the following command : `mvn test`

If it runs successfully then you have Java and Maven Installed on Mac.

---          