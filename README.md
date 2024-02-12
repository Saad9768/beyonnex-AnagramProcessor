Anagram Service
The Anagram Service is a Spring Boot application designed to provide utility functions for processing anagrams. It offers functionalities to check if two strings are anagrams of each other and to generate all possible anagrams of a given string.

Features
areAnagrams(String text1, String text2): Determines whether two strings are anagrams, considering letter case and ignoring spaces.
generateAnagrams(String input): Generates a set of all possible anagrams from the input string.
Getting Started
Prerequisites
JDK 17
Maven 3.6+
Building the Project
To build the project, run the following command in the root directory:

shell
Copy code
mvn clean install
Running the Application
Once built, you can run the application using:

shell
Copy code
java -jar target/anagram-service-0.0.1-SNAPSHOT.jar
Alternatively, if you have Spring Boot CLI installed, you can use:

shell
Copy code
spring-boot:run
Usage
This application is designed to be used as a library within other Spring Boot applications or services. Here is how you can use the provided functionalities:

java
Copy code
import com.AnagramProcessor.Anagram.service.impl.AnagramServiceImpl;

public class AnagramExample {
    
    public static void main(String[] args) {
        boolean result = AnagramServiceImpl.areAnagrams("listen", "silent");
        System.out.println("Are listen and silent anagrams? " + result);

        Set<String> anagrams = AnagramServiceImpl.generateAnagrams("abc");
        System.out.println("Generated anagrams of 'abc': " + anagrams);
    }
}
Testing
This project includes JUnit tests for its utility methods. To run the tests, execute:

shell
Copy code
mvn test
