# 🚀 Spring Boot Learning Journey

Welcome to my Spring Boot repository! This repository documents my daily hands-on practice, concepts, experiments, and projects as I learn Spring Boot from the ground up with **Coder Army**.

---

## 📌 About This Repository
- **Author:** Alok Rana
- **Goal:** Master Spring Boot framework, build scalable RESTful APIs, and document the daily learning journey.
- **Tech Stack:**
  - **Language:** Java 25
  - **Framework:** Spring Boot 4.x
  - **Build Tool:** Apache Maven
  - **IDE:** IntelliJ IDEA

---

## 🗺️ Learning Roadmap & Daily Progress

- [x] **Day 01: Introduction to Spring & Spring Boot**
  - Why Spring was created (EJB vs POJOs)
  - Core Java vs Spring Boot
  - Embedded Tomcat, Starters, and Auto-configuration
  - 📝 [Day 1 Notes](notes/day01-spring-boot-intro.md)

- [x] **Day 02: First Spring Boot App & REST Controller**
  - `@SpringBootApplication` and Component Scanning
  - `@RestController` vs `@Controller`
  - First API Endpoint (`/hello`) on port `9090`
  - 📝 [Day 2 Notes](notes/day02-first-rest-controller.md) | 💻 [Code: HelloController.java](src/main/java/com/example/demo/HelloController.java)

- [x] **Day 03: Apache Maven & Build Management Deep Dive**
  - Coordinate system (`groupId`, `artifactId`, `version`)
  - Starters & Transitive Dependencies
  - Maven Dependency Scopes (`test` vs `compile`)
  - Maven Wrapper (`mvnw`)
  - 📝 [Day 3 Notes](notes/day03-apache-maven-deep-dive.md) | ⚙️ [Config: pom.xml](pom.xml)

- [ ] **Day 04: Inversion of Control (IoC) & Dependency Injection (DI)** *(In Progress)*
  - Understanding Spring Container / ApplicationContext
  - Tight Coupling vs Loose Coupling
  - `@Component`, `@Autowired`, Constructor Injection
  - 📝 *Notes & Hands-on code coming up!*

- [ ] **Day 05: Request Handling & Spring MVC**
  - `@RequestParam`, `@PathVariable`, `@RequestBody`
  - JSON serialization & deserialization

- [ ] **Day 06: Layered Architecture & Business Logic**
  - Controller -> Service -> Repository layers
  - DTOs and Entities

- [ ] **Day 07: Spring Data JPA & Databases**
  - Connecting relational databases (MySQL / PostgreSQL / H2)
  - CRUD operations and custom finder methods

---

## 📂 Project Structure
```text
.
├── notes/                           # Topic-wise study notes & interview questions
│   ├── day01-spring-boot-intro.md
│   ├── day02-first-rest-controller.md
│   └── day03-apache-maven-deep-dive.md
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── DemoApplication.java # Spring Boot entry point
│   │   │   └── HelloController.java # Day 2 REST controller
│   │   └── resources/
│   │       └── application.properties # Configuration (server.port=9090)
│   └── test/                        # Automated unit tests
├── pom.xml                          # Maven build dependencies & plugins
└── README.md
```

---

⭐ *Updated daily with code, experiments, and notes!*
