<h1 align="center">UrlShortening-Application</h1>
<h3 align="center">This is a backend Java application created with Spring Boot. The application allows users to shorten long URLs into shorter, more manageable ones.</h3>

# Features
1. Shorten long URLs to compact and user-friendly URLs.
2. Redirect users from shortened URLs to the original long URLs.
3. Manage URLs through CRUD operations (Create, Read, Update, Delete).
4. Utilize MySQL database for data storage.
5. Dockerfile to run on any environment
6. Swagger2 for documentation 

# Technologies Used
1. Java
2. Spring Boot
3. MySQL Database
4. Docker
5. Swagger2

# Prerequisites
Before running the application, make sure you have the following software installed:

Java Development Kit (JDK)
Apache Maven

# Getting Started
To get started with the URL Shortening Application, follow these steps:

Clone the repository:
git clone https://github.com/IfedayoPeter/UrlShortening-Application.git

Navigate to the project directory:
cd UrlShortening-Application

Build the project using Maven:
mvn clean install

Run the application:
java -jar target/url-shortening-application.jar

Access the application in your web browser:
http://localhost:8089

# Configuration
The application uses the default configuration provided by Spring Boot. However, if you need to modify any settings, you can do so in the application.properties file located in the src/main/resources directory.

# Database
The application utilizes MySQL database. You can access the database from MySQL workbench.
configure the application properties file with your local machine MySQL server:

JDBC URL: jdbc:mysql://localhost:3306/your_db_name?useSSL=false
User Name: your username
Password: your password

# API Endpoints
http://localhost:8089/swagger-ui/index.html
The following API endpoints are available for interacting with the application:

POST /shorten/generate: Shorten a long URL.
GET /shorten/id: Redirects shortened url to original url

Please refer to the source code for more details on the API implementation.
