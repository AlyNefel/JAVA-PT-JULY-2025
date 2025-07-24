# 🚀 Spring Boot Project Setup Guide (JSP Edition)

Welcome to your first Spring Boot adventure! 🌱  
Follow these steps to create a web project using JSP with Spring Boot. No dragons, just code. 🐉

---

## 🧰 Step-by-Step Setup

### 1️⃣ Open STS (Spring Tool Suite)
Launch your IDE like a boss. 💻

### 2️⃣ Go to `File → New → Spring Starter Project`
This is your gateway to Spring Boot magic.

### 3️⃣ Choose a Project Name
Pick something meaningful. Example: `plant-monitor` or `smart-help`.

### 4️⃣ Type: Select `Maven`
Because Maven is your build buddy. 🧱

### 5️⃣ Java Version
Choose the version installed on your machine (e.g., 17 or 21).

### 6️⃣ Group Name (Important!)
Use **reverse domain format**:  
Example: `com.one.test`  
This keeps your project organized and professional.

### 7️⃣ Package Name
Use the same name as your group:  
✅ `com.one.test`

### 8️⃣ Click `Next` → Select Dependencies
Check these boxes:
- `Spring Boot DevTools` (for hot reload 🔥)
- `Spring Web` (for building web apps 🌐)

### 9️⃣ Click `Finish`
Boom! Your project is born. 🎉

---

## 🗂️ Project Structure Tweaks

### 🔟 Under `src/main`, create a new folder:
📁 `webapp`

### 1️⃣1️⃣ Inside `webapp`, create:
📁 `WEB_INF`  
This is where your JSP files will live.

### 1️⃣2️⃣ Open `application.properties` (under `src/main/resources`)  
Add this line:

`properties`
`spring.mvc.view.prefix=/WEB_INF/`
This is where your JSP files will live.

🧭 Create Your Controller
### 1️⃣3️⃣ Under `src/main/java`, right-click your main package (com.one.test)
Create a new package:
com.one.test.controllers


### 1️⃣4️⃣ Right-click the new package → New → Class
Name it:
MainController

### 1️⃣5️⃣ Add the `@Controller` annotation at the top of your class:

`package com.one.test.controllers;`

``import org.springframework.stereotype.Controller;``

``@Controller``
``public class MainController {``
    ``// Your controller methods go here``
``}``



### 🧪 Add Dependencies to pom.xml
Paste the following inside the <dependencies> section:


<dependencies>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>

    <dependency>
        <groupId>org.apache.tomcat.embed</groupId>
        <artifactId>tomcat-embed-jasper</artifactId>
    </dependency>

    <dependency>
        <groupId>jakarta.servlet.jsp.jstl</groupId>
        <artifactId>jakarta.servlet.jsp.jstl-api</artifactId>
    </dependency>

    <dependency>
        <groupId>org.glassfish.web</groupId>
        <artifactId>jakarta.servlet.jsp.jstl</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-devtools</artifactId>
        <scope>runtime</scope>
        <optional>true</optional>
    </dependency>

    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
</dependencies>


### 📦 Note on pom.xml
This is your starter pack. Later, you’ll add more dependencies for:

# Database connection (e.g., MySQL)

# Authentication

# Validation

### 👉 A full pom.xml is available on the platform under: fullSpring → Project Setup


### 🎉 You’re Ready to Code!
Now you can:

Create JSP views inside WEB_INF

Add controller methods to render pages

Build your first Spring Boot web app!