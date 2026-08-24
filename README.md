# Department-management-system-MINI

## 📌 Project Overview

This is a simple Department Management System developed using Java and Spring Core.

The project demonstrates Spring Core concepts such as Dependency Injection, IoC Container, Spring Beans, XML Configuration, and Autowiring.

An Employee is associated with a Department. The application supports multiple department implementations such as IT, HR, and Finance.

## 🛠️ Technologies Used

- Java
- Spring Core
- Maven
- XML Configuration

## 📂 Project Structure

Department-management-system-MINI/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── jagannath/
│       │           ├── App.java
│       │           ├── Employee.java
│       │           ├── Department.java
│       │           ├── IT.java
│       │           ├── HR.java
│       │           └── Finance.java
│       │
│       └── resources/
│           └── config.xml
│
├── pom.xml
│
└── README.md

## 🏗️ Project Architecture

Department
│
├── IT
├── HR
└── Finance
    │
    ▼
Employee

## 🔄 Project Working

1. The application starts from the main class.
2. Spring loads the XML configuration file.
3. The Spring IoC Container creates and manages the required beans.
4. An Employee object is created.
5. A Department dependency is injected into the Employee.
6. Employee details and department information are displayed.

## 💉 Dependency Injection

The Employee class depends on the Department interface.

Spring injects a Department implementation into the Employee object.

The project demonstrates:

- Setter Injection
- Constructor Injection
- Bean Reference
- Autowiring byName
- Autowiring byType

## 🔵 Autowiring byName

In byName autowiring, Spring searches for a bean based on the name of the dependency property.

For successful dependency injection:

Property Name = Bean ID

## 🟢 Autowiring byType

In byType autowiring, Spring searches for a bean based on the required dependency type.

This works correctly when only one matching bean is available.

## ❌ byType Ambiguity

The project contains multiple implementations of the Department interface:

- IT
- HR
- Finance

When Employee requires a Department object, Spring may find multiple matching beans.

Employee requires → Department

Spring finds:

- IT → Department
- HR → Department
- Finance → Department

This creates ambiguity because Spring cannot determine which Department implementation should be injected.

## ✅ Solution

The ambiguity can be resolved by explicitly specifying which Department bean should be injected into the Employee.

This allows the application to select a specific department such as IT, HR, or Finance.

## 🧠 Concepts Covered

- Spring Core
- IoC Container
- ApplicationContext
- Spring Beans
- Dependency Injection
- XML Configuration
- Setter Injection
- Constructor Injection
- Autowiring byName
- Autowiring byType
- Interface-based Programming
- Bean Ambiguity

## ▶️ How to Run

1. Clone the repository.
2. Open the project in IntelliJ IDEA or Eclipse.
3. Download the Maven dependencies.
4. Make sure the XML configuration file is inside the resources folder.
5. Run the main application class.

## 👨‍💻 Author

**Jagannath Das**

⭐ If you found this project useful, please give it a star!
