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

### ✅ Day 05: Spring IoC Container & Bean Management
- Managing beans via Spring's `AnnotationConfigApplicationContext`
- Configuration & Component Scanning (`@Configuration`, `@ComponentScan`)
- `@Component` (Automatic discovery) vs `@Bean` (Explicit object creation)
- Creating Parameterized Beans via `@Bean` method (`User` model initialized with custom state)
- Constructor Injection using `@Autowired`
- Custom Qualifier naming (`@Qualifier("Sms")`, `@Qualifier("pop")`, `@Qualifier("Email")`)
### ✅ Day 06: Circular Dependency & Resolution
- Understanding Circular Dependency loops (`OrderService` ⇄ `PaymentService`)
- Diagnosing `BeanCurrentlyInCreationException` during Constructor Injection
- Breaking the circular reference cycle using Field Injection (`@Autowired`)
- Deep dive: How Spring's two-phase lifecycle (Instantiation vs Property Population) solves circularity

### ⏳ Day 07: Spring Bean Lifecycle *(In Progress)*
- Understanding Bean Lifecycle stages: Instantiation ➔ Dependency Injection ➔ Init Callback ➔ Bean Ready ➔ Destroy Callback
- Exploring `@PostConstruct` and `@PreDestroy`
- Implementing `InitializingBean` and `DisposableBean` interfaces

---

## 📂 Project Structure
```text
.
├── src/
│   ├── main/
│   │   ├── java/com/example/demo/
│   │   │   ├── _di_ioc/               # Spring IoC Container & Dependency Injection
│   │   │   │   ├── circulardependency/# Circular Dependency & Resolution via Field Injection
│   │   │   │   │   ├── AppConfig.java
│   │   │   │   │   ├── OrderService.java
│   │   │   │   │   ├── PaymentService.java
│   │   │   │   │   └── Main.java
│   │   │   │   ├── beanlifecycle/     # Bean Lifecycle Callbacks (In Progress)
│   │   │   │   ├── user/
│   │   │   │   │   └── User.java      # POJO model created via @Bean
│   │   │   │   ├── AppConfig.java     # @Configuration, @ComponentScan, @Bean
│   │   │   │   ├── EmailService.java  # @Component, @Primary, @Qualifier("Email")
│   │   │   │   ├── SmsService.java    # @Component, @Qualifier("Sms")
│   │   │   │   ├── PopupService.java  # @Component, @Qualifier("pop")
│   │   │   │   ├── NotificationService.java # Interface
│   │   │   │   ├── OrderService.java  # @Component, @Autowired
│   │   │   │   └── Main.java          # IoC Container runner
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
