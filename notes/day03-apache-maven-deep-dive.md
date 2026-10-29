# 📖 Day 03: Apache Maven & Build Management Deep Dive

## 🎯 Objectives
- Understand what a Build Tool is and why Maven is used.
- Dissecting `pom.xml` (Project Object Model).
- Understanding Starters, Dependencies, and Transitive Dependencies.
- Maven Scope and Maven Wrapper (`mvnw`).

---

## 1. What is Apache Maven?
Maven is a build automation and dependency management tool. It handles:
- Downloading external libraries (JARs) automatically from Maven Central.
- Compiling Java source files (`javac`).
- Running automated test suites.
- Packaging the application into a standalone runnable `.jar` file.

---

## 2. Anatomy of `pom.xml`

### A. Coordinate System (GAV)
Every Maven artifact is uniquely identified by three coordinates:
- **`groupId`**: Organization / domain (`com.example`)
- **`artifactId`**: Specific project / module name (`SpringBoot`)
- **`version`**: Project version (`0.0.1-SNAPSHOT`)

### B. Parent POM
```xml
<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>4.1.2</version>
    <relativePath/>
</parent>
```
Provides pre-configured dependency version management, compiler defaults, and standard plugin configurations so child dependencies don't need explicit `<version>` tags.

### C. Dependencies & Transitive Dependencies
1. **`spring-boot-starter-webmvc`**:
   - Downloads embedded Tomcat, Jackson (JSON converter), SLF4J/Logback (logging), and Spring Web framework.
   - **Transitive Dependencies**: When Maven downloads `spring-boot-starter-webmvc`, it automatically resolves and downloads all underlying libraries it depends on.
2. **`spring-boot-starter-webmvc-test`**:
   - Testing libraries (JUnit, Mockito, AssertJ).
   - **`<scope>test</scope>`**: Excluded from the production JAR, keeping deployment packages lightweight.

---

## 3. Maven Lifecycle & Commands
- `./mvnw compile`: Compiles source code to `target/classes`.
- `./mvnw test`: Executes automated unit tests.
- `./mvnw package`: Packages compiled code into an executable JAR.
- `./mvnw clean`: Deletes the `target/` directory for a fresh build.

---

## 4. What is Maven Wrapper (`mvnw`)?
`mvnw` is a small script committed into the project repository that allows anyone to build and run the project **without installing Maven globally on their machine**. It automatically downloads and runs the exact compatible Maven version defined in `.mvn/wrapper/maven-wrapper.properties`.
