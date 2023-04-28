# University Event Management System
<p>This is a Spring Boot project for managing university events and students. The application uses the H2 database to store the data. 
The application provides RESTful API endpoints to perform CRUD operations on the student and event entities.</p>

## Features
* Add student
* update student department
* delete student
* Get all students 
* Get student by Id
* Add event
* Update event
* Delete event
* Get All events by date

## Technologies
* Java 
* Spring Boot 
* H2 Database
* Maven

## Setup 
1. <p>Clone the repository.</p>

```bash
git clone https://github.com/Madhurpatari/UniversityEventManagement.git 
```

## Usage
<p>The application runs on port 8080 by default. The following endpoints are available:</p>

## Students
* POST /students - Add student
* PUT /students/{id} - Update student department
* DELETE /students/{id} - Delete student
* GET /students - Get all students
* GET /students/{id} - Get student by Id
## Events
* POST /events - Add event
* PUT /events/{id} - Update event
* DELETE /events/{id} - Delete event by Id
* GET /events/by-date - Get all events by date


## Validation
<p>The application performs validation on the following fields:</p1.>

* Student age (between 18-25)
* Student first name (first letter should be capital)
* Student department (datatype of variable department should be Enum and not string Enum should support department names line ME, ECE, civil, CSE)


