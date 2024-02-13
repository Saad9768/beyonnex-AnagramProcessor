# Anagram Service
The Anagram Service is a Spring Boot application designed to provide utility functions for processing anagrams. It offers functionalities to check if two strings are anagrams of each other and to generate all possible anagrams of a given string.

## Features
#### There are 2 endpoints
``[GET] /anagram/:str1/:str2`` => It will return true if both the strings are Anagram  <br />
``[GET] /anagram/:input`` => It will return all the possible Anagram. If there are no Anagram it will return empty SET  <br />
## Getting Started
#### Prerequisites
JDK 17 <br />
Maven 3.6+ <br />
#### Building the Project
To build, Run the projectin the root directory:  <br />
``mvn clean package`` => This wil create a ``.jar`` file. It will also run the test case. <br /> <br />
To run the project, Run  the following command in the root directory:  <br />
``mvn spring-boot:run`` <br />


## Testing
This project includes JUnit tests for its utility methods. To run the tests, execute:
To run only the test, Run the following command in the root directory:  <br />
``mvn test`` <br />

## Deploy Project 
### Please follow the below steps: 
#### Install Docker on your machine
Run the following command it will Dockerfile which is present in the root directory.<br />
To make image of the docker file run the following command. At the time of image creation it will run all the test cases accordingly<br /> 
``docker build -t <image_name> .``  <br /> <br />
To Run the Docker image: <br />
``docker run --name your_container_name --restart=always -d your_image_name`` <br />


