# CRUD-Operations

Overview 

This project is a Spring Boot application that provides CRUD (Create, Read, Update, Delete) operations for managing users. It includes validation, transactional management, and exception handling to ensure robust and reliable data management.

Features
Create User: Add new users with validation to ensure data integrity.
Read User(s): Retrieve user details by ID or get a list of all users.
Update User: Update existing user details with validation.
Delete User: Remove users from the database.
Validation: Ensures that user data meets specific criteria.
Transactional Management: Ensures operations are completed successfully or rolled back.
Exception Handling: Gracefully handles and returns meaningful error messages.

Technologies Used
Spring Boot: Framework to create stand-alone, production-grade Spring-based applications.
Spring Data JPA: Abstraction layer to simplify database interactions.
Lombok: Reduces boilerplate code for model classes.
PostgreSQL: Relational database management system.
H2 Database: In-memory database for development and testing (optional).

API Endpoints
Create User: POST /api/user/addUser
Request Body: UserDto
Get User by ID: GET /api/user/getUser/{id}
Get All Users: GET /api/user/getAllUsers
Update User: PUT /api/user/update/{id}
Request Body: UserDto
Delete User: DELETE /api/user/deleteUser/{id}

Validation
The UserDto class includes validation annotations to ensure data integrity:

@NotBlank: Ensures the field is not null and not empty.
@Size: Specifies the size constraints on the field.
@Pattern: Ensures the field matches a specific regular expression.
Exception Handling
The ValidationExceptionHandler class handles validation exceptions and returns meaningful error messages to the client.

