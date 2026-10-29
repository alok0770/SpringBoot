# 📖 Day 02: First Spring Boot Application & REST Controller

## 🎯 Objectives
- Understanding the Main class and `@SpringBootApplication`.
- Understanding `@RestController` vs `@Controller`.
- Handling HTTP GET requests using `@GetMapping`.
- Testing our first endpoints in the browser.

---

## 1. Anatomy of the Main Application
```java
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}
```
`@SpringBootApplication` is a composite annotation combining:
1. `@SpringBootConfiguration`: Marks the class as a configuration source.
2. `@EnableAutoConfiguration`: Enables Spring Boot's automatic configuration mechanism.
3. `@ComponentScan`: Tells Spring to scan for components (`@Component`, `@RestController`, `@Service`, `@Repository`) starting from this package (`com.example.demo`) and all its sub-packages.

---

## 2. `@RestController` vs `@Controller`
- **`@Controller`**: Used in traditional Spring MVC to return HTML views/templates (e.g., JSP, Thymeleaf).
- **`@RestController`**: Special combination of `@Controller` + `@ResponseBody`. It directly returns data (raw text, HTML strings, or JSON) directly into the HTTP response body without resolving a view.

---

## 3. Hands-On Code: `HelloController.java`
Located at [`src/main/java/com/example/demo/HelloController.java`](../src/main/java/com/example/demo/HelloController.java):

```java
package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    // URL: http://localhost:9090/hello
    @GetMapping("hello")
    public String hello() {
        return "<h1>Hello Alok</h1>";
    }

    // URL: http://localhost:9090/age
    @GetMapping("age")
    public void age() {
        int age = 20;
        System.out.println(age);
    }
}
```

### Key Highlights:
- `@GetMapping("hello")`: Maps HTTP GET requests sent to `/hello` to execute the `hello()` method.
- Port configuration in `application.properties`:
  ```properties
  server.port=9090
  ```
- Endpoint Test: Visiting `http://localhost:9090/hello` renders the HTML heading directly in the browser.
