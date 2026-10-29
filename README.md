# 🚀 Spring Boot Learning Journey

Welcome to my Spring Boot repository! This repository documents my daily learning journey and hands-on practice with **Coder Army**.

---

## 📌 About This Repository
- **Author:** Alok Rana
- **Goal:** Master Spring Boot framework and build scalable backend applications.
- **Tech Stack:** Java 25, Spring Boot 4.x, Apache Maven, IntelliJ IDEA

---

## 🗺️ Daily Topics Covered

### ✅ Day 01: Introduction to Spring & Spring Boot
- History of Spring Framework & problems with EJB
- Core Java vs Spring Boot (Console vs Web Server)
- Why Spring Boot: Inbuilt Embedded Tomcat, Starter Dependencies, Auto-Configuration

### ✅ Day 02: First Spring Boot Application
- Anatomy of `@SpringBootApplication` and Component Scanning
- Creating first REST API with `@RestController` and `@GetMapping`
- Configuring application port (`server.port=9090`)
- Running and testing endpoints (`/hello`, `/age`)

### ✅ Day 03: Apache Maven Deep Dive
- What is a Build Tool & why Maven is used
- Understanding `pom.xml`: GAV Coordinates (`groupId`, `artifactId`, `version`)
- Starters & Transitive Dependencies
- Dependency Scopes (`compile` vs `test`)
- Maven Wrapper (`mvnw`) for standalone builds

### ✅ Day 04: Understanding DI & IoC via Loose Coupling
- Tight Coupling vs Loose Coupling (Why IoC is needed)
- Hands-on implementation: `NotificationService` interface with `EmailService`, `SmsService`, and `PopupService`
- Constructor Dependency Injection in `OrderService`
- Next: Transitioning to Spring's actual IoC Container (`ApplicationContext`, `@Component`, `@Autowired`)

---

## 📂 Project Structure
```text
.
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── day04_di/              # Day 4: Dependency Injection & Loose Coupling
│   │   │   │   ├── EmailService.java
│   │   │   │   ├── SmsService.java
│   │   │   │   ├── PopupService.java
│   │   │   │   ├── NotificationService.java
│   │   │   │   ├── OrderService.java
│   │   │   │   └── Main.java
│   │   │   ├── DemoApplication.java   # Spring Boot entry point
│   │   │   └── HelloController.java   # Day 2 REST controller
│   │   └── resources/
│   │       └── application.properties # Configuration (server.port=9090)
│   └── test/                          # Unit tests
├── pom.xml                            # Maven dependencies & plugins
└── README.md
```

---

⭐ *Updated daily with each topic covered!*
