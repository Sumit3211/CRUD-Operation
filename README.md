CRUD-Operation
Important: This project implements a CRUD (Create, Read, Update, Delete) operation using Spring Boot, Hibernate, and MySQL. Below are the steps and requirements for setting up and running this project on your system.

Project Description
This project demonstrates a simple CRUD application built with Spring Boot. It includes functionalities to create, read, update, and delete user information. The project uses Hibernate for ORM (Object-Relational Mapping) and MySQL as the database.

Requirements

Java Development Kit (JDK) 8 or higher - Ensure you have JDK installed on your system.
Maven - This project uses Maven for dependency management.
MySQL Database - Install and configure MySQL. Create a database for this project.
Spring Boot - The project is built using Spring Boot, but no additional setup is required as Maven handles dependencies.
Thymeleaf - Thymeleaf is used as the template engine for the front-end.
Bootstrap - Bootstrap is used for styling the front-end pages.

Configure the Database

Open the application.properties file located in src/main/resources.
Update the database configuration with your MySQL credentials

spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect

Application Endpoints

Home Page: /home
User Details: /details
Edit User: /edit/{id}
Update User: /update/{id}
Create User: /create
Delete User: /delete/{id}

Project Structure

Controllers: Handles incoming HTTP requests and returns responses.
Services: Contains business logic and interacts with the repository layer.
Repositories: Interfaces for CRUD operations on the database.
Models: Contains entity classes mapped to database tables.
Views: Thymeleaf templates for the front-end.


