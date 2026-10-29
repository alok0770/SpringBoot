# 📖 Day 01: Introduction to Spring & Spring Boot

## 🎯 Objectives
- Understand why Spring Framework was created.
- Difference between Core Java, Spring, and Spring Boot.
- Key features and problems solved by Spring Boot.

---

## 1. Why Spring Framework?
In early enterprise Java (EJB era):
- Writing enterprise apps required complex, heavy boilerplate code.
- Developers had to manage object lifecycles, configuration files, and heavy enterprise application servers (WebLogic, WebSphere).
- **Rod Johnson** introduced Spring Framework in 2002 to simplify enterprise Java development through **Dependency Injection (DI)** and **Plain Old Java Objects (POJOs)**.

---

## 2. Core Java vs Spring Boot
| Feature | Core Java (Console Application) | Spring Boot (Enterprise Backend) |
| :--- | :--- | :--- |
| **Execution** | Runs in local console / terminal | Runs on embedded web server (Tomcat) 24/7 |
| **Target Users** | Single user on same machine | Millions of users across web & mobile |
| **Object Creation** | Manual (`new Calculator()`) | Managed by Spring Container (IoC / DI) |
| **Input Source** | Keyboard (`Scanner`, `System.in`) | HTTP Requests (`@RequestParam`, `@RequestBody`) |
| **Output** | Console (`System.out.println`) | JSON / HTTP Responses |

---

## 3. Why Spring Boot over Traditional Spring?
Traditional Spring required heavy XML configurations (`web.xml`, `applicationContext.xml`) and manual Apache Tomcat deployment (WAR files).

Spring Boot solved this with **3 Superpowers**:
1. **Auto-Configuration (`@EnableAutoConfiguration`):** Configures common libraries automatically based on classpath dependencies.
2. **Starter POMs (`spring-boot-starter-*`):** Curated dependency bundles that eliminate dependency version conflicts.
3. **Embedded Web Server:** Tomcat / Jetty embedded directly inside the JAR, eliminating separate server installations.
4. **Production-Ready Features:** Health metrics, application monitoring (Actuator), and externalized configurations.

---

## 💡 Key Takeaway
Spring Boot is **opinionated**; it assumes sensible defaults so developers can stop configuring servers and start writing business logic immediately.
