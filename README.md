# Personal Blog Project
This is a personal blog application developed using Spring Boot. It allows users to register, log in, create, and manage blog posts.

## Technologies Used
- Java 17
- Spring Boot
- Maven
- Spring Data JPA
- Spring Security
- JWT (JSON Web Tokens)
- MySQL (for production/main database)
- PostgreSQL (as an alternative production/main database)
- H2 Database (for testing)
- SpringDoc OpenAPI (for API documentation)

## Features
- User registration and authentication (Login/Logout)
- JWT-based security for API endpoints
- Create, Read, Update, and Delete (CRUD) operations for blog posts
- (User can add more specific features here)

## Getting Started

### Prerequisites
- JDK 17 or later (as specified in `pom.xml`)
- Maven 3.6 or later
- Git

### Cloning the Repository
```bash
git clone <repository_url>
cd blogpessoal
```
(Note: Replace `<repository_url>` with the actual URL of this repository.)

## Installation and Running
Once you have the prerequisites installed and the repository cloned, navigate to the project directory (`blogpessoal`).

### Database Configuration
Before running the application, you'll need to configure your database connection. See the 'Configuration' section below.

### Running the Application
You can run the application using Maven with the following command:
```bash
mvn spring-boot:run
```
This command will start the embedded Tomcat server (or appropriate server based on Spring Boot configuration), and the application will be accessible, typically at `http://localhost:8080`.

Spring Boot profiles might be used to differentiate configurations (e.g., `dev`, `prod`). If so, you might need to activate a specific profile. Check the `application.properties` file and its variants (e.g., `application-dev.properties`, `application-prod.properties`). For example, to run with a 'dev' profile:
```bash
mvn spring-boot:run -Dspring-boot.run.profiles=dev
```

## Configuration
Application settings, including database connection details, are configured in `src/main/resources/application.properties`.

This project uses profile-specific properties files:
- `application-dev.properties`: For development environment.
- `application-prod.properties`: For production environment.
The active profile determines which file's properties override the defaults in `application.properties`.

For example, to configure a MySQL database for the 'dev' profile, you would update `src/main/resources/application-dev.properties` with your database URL, username, and password:
```properties
# Example for application-dev.properties
spring.datasource.url=jdbc:mysql://localhost:3306/your_blog_db_dev?createDatabaseIfNotExist=true&serverTimezone=UTC
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update # Or 'create' for initial setup, 'validate' for production

# For PostgreSQL, the URL would be like:
# spring.datasource.url=jdbc:postgresql://localhost:5432/your_blog_db_dev
```
Ensure the appropriate JDBC driver dependency (MySQL or PostgreSQL) is active in your `pom.xml` if you switch between them, though both are included.

## API Documentation
This project uses SpringDoc OpenAPI to generate API documentation. Once the application is running, you can access the Swagger UI in your browser.

Typically, the documentation is available at one of the following URLs:
 - [`http://localhost:8080/swagger-ui.html`](http://localhost:8080/swagger-ui.html)
 - [`http://localhost:8080/swagger-ui/index.html`](http://localhost:8080/swagger-ui/index.html)

The base path for the OpenAPI specification is usually:
 - [`http://localhost:8080/v3/api-docs`](http://localhost:8080/v3/api-docs)

(The port `8080` is the default; if you have configured a different server port, please adjust the URL accordingly.)

## Credentials
To access the application, use the following default credentials:
```
Username: root@root.com
Password: rootroot
```
**Note:** These are default credentials, presumably for development and testing purposes. It is strongly recommended to change these credentials in a production environment for security reasons.
