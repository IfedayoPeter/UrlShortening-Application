<h1 align="center">UrlShortening-Application</h1>
<h3 align="center">This is a backend Java application created with Spring Boot and H2 database. The application allows users to shorten long URLs into shorter, more manageable ones.</h3>

# Features
1. Shorten long URLs to compact and user-friendly URLs.
2. Redirect users from shortened URLs to the original long URLs.
3. Manage URLs through CRUD operations (Create, Read, Update, Delete).
4. Utilize H2 in-memory database for data storage.

# Technologies Used
1. Java
2. Spring Boot
3. H2 Database

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
The application utilizes the H2 in-memory database by default. You can access the H2 console by visiting the following URL in your browser:
http://localhost:8089/h2-console
Make sure to use the following settings when prompted for login:

JDBC URL: jdbc:h2:mem:testdb
User Name: sa
Password: (leave it empty)

# API Endpoints
http://localhost:8089/swagger-ui/index.html
The following API endpoints are available for interacting with the application:

POST /shorten/generate: Shorten a long URL.
GET /shorten/id: Redirects shortened url to original url

Please refer to the source code for more details on the API implementation.
