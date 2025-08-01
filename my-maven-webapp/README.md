# My Maven Web Application

## Overview
This is a simple Java web application built using Maven. It follows the MVC (Model-View-Controller) architecture and is packaged as a WAR file for deployment on a servlet container.

## Project Structure
```
my-maven-webapp
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── webapp
│   │   │               ├── controller
│   │   │               │   └── HomeController.java
│   │   │               ├── model
│   │   │               │   └── User.java
│   │   │               └── service
│   │   │                   └── UserService.java
│   │   ├── resources
│   │   │   └── application.properties
│   │   └── webapp
│   │       ├── WEB-INF
│   │       │   └── web.xml
│   │       └── views
│   │           └── index.jsp
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── webapp
│                       └── HomeControllerTest.java
├── pom.xml
└── README.md
```

## Setup Instructions
1. **Clone the repository**:
   ```bash
   git clone <repository-url>
   cd my-maven-webapp
   ```

2. **Build the project**:
   Use Maven to build the project and package it as a WAR file.
   ```bash
   mvn clean package
   ```

3. **Deploy the WAR file**:
   The generated WAR file can be found in the `target` directory. Deploy it to your servlet container (e.g., Apache Tomcat).

## Usage
- Access the application by navigating to `http://localhost:8080/my-maven-webapp` in your web browser.
- The home page is served by the `HomeController` and rendered using the `index.jsp` view.

## Dependencies
This project uses the following dependencies (as specified in `pom.xml`):
- Spring Framework (for MVC support)
- JUnit (for testing)

## Contributing
Feel free to submit issues or pull requests if you would like to contribute to this project.

## License
This project is licensed under the MIT License. See the LICENSE file for more details.