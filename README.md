# Library Management System -- Java Maven WAR Project

## Project Overview

This is a simple Java based Library Management System web application
created as a Maven WAR project. The purpose of this project is to
demonstrate a basic Java web application structure and to use it for
Continuous Integration and Code Quality analysis using Jenkins and
SonarQube as part of the DevOps laboratory assignment.

The application displays a small list of books using a servlet.

## Technologies Used

-   Java 8
-   Maven
-   Servlet API
-   JSP
-   Apache Tomcat (or any servlet container)
-   Jenkins
-   SonarQube

## Project Structure

library-management-system
 ├── pom.xml
 ├── src
 │   └── main
 │       ├── java
 │       │   └── com
 │       │       └── saco
 │       │           └── library
 │       │               ├── model
 │       │               │   └── Book.java
 │       │               ├── service
 │       │               │   └── LibraryService.java
 │       │               └── web
 │       │                   └── BookServlet.java
 │       └── webapp
 │           ├── index.jsp
 │           └── WEB-INF
 │               └── web.xml
 └── target
     └── library.war

## Application Description

The application contains the following main components:

-   Book\
    A simple model class representing a book.

-   LibraryService\
    A service class that maintains a small in-memory list of books.

-   BookServlet\
    A servlet that displays the list of books in the browser.

-   index.jsp\
    A simple welcome page with a link to view books.

## How to Build the Project

Open a command prompt or PowerShell in the project root directory and
run:

mvn clean package

After a successful build, the WAR file will be created at:

target/library.war

## How to Run the Application

1.  Deploy the generated WAR file to a servlet container such as Apache
    Tomcat.
2.  Copy the file target/library.war into the Tomcat webapps directory.
3.  Start the Tomcat server.
4.  Open the browser and access:

http://localhost:8080/library/

To view the list of books:

http://localhost:8080/library/books

## Purpose of This Project

This project is created for academic and learning purposes to
demonstrate:

-   Maven based Java web application
-   WAR packaging
-   Standard project structure
-   Integration with Jenkins for continuous build
-   Integration with SonarQube for code inspection and quality analysis

## DevOps and SonarQube Integration

Recommended Sonar configuration:

sonar.projectKey=com.saco.library:library-management-system
sonar.projectName=LLibrary Management System
sonar.sources=src

## Author

Created as part of M.Tech DevOps laboratory assignment.
