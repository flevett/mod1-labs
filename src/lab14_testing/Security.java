//package lab14_testing;
//
//public class Security {
//    public boolean login(String userId, String password) {
//        String errorMessage;
//// userId must not be null or spaces. Must be 8 chars minimum.
//// password must contain a digit and an upper case char
//        if (userId == null || userId.trim().equals("")) {
//            errorMessage = "UserID may not be null or empty";
//            return false;
//        }
//        else if (password == null || password.trim().equals("")) {
//            errorMessage = "Password may not be null or empty";
//            return false;
//        }
//        else if (!validatePassword(password)) {
//            errorMessage = "Password must be min 8 chars long with an uppercase and a number";
//            return false;
//        }
//        else {
//            errorMessage = "";
//            return true;
//        }
//    }
//
//    private boolean validatePassword(String password) {
//        boolean hasUpper = false, hasDigit = false;
//        if (password.length() < 8)
//            return false;
//        for (char c : password.toCharArray()) {
//            if (Character.isUpperCase(c)) {
//                hasUpper = true;
//// continue loop as no character can be both!
//                continue;
//            }
//            if (Character.isDigit(c)) {
//                hasDigit = true;
//            }
//        }
//        return hasUpper && hasDigit;
//    }
//}

//TEST CODE
//package org.example;
//
//import org.junit.jupiter.api.Test;
//import static org.junit.jupiter.api.Assertions.*;
//
//public class AppTest {
//
//    @Test
//    void testLoginValid() {
//        App app = new App();
//        assertTrue(app.login("user1234", "Password1"));
//    }
//
//    @Test
//    void testLoginNullUser() {
//        App app = new App();
//        assertFalse(app.login(null, "Password1"));
//    }
//
//    @Test
//    void testLoginEmptyUser() {
//        App app = new App();
//        assertFalse(app.login("   ", "Password1"));
//    }
//
//    @Test
//    void testLoginInvalidPassword() {
//        App app = new App();
//        assertFalse(app.login("user1234", "password")); // no uppercase or digit
//        assertFalse(app.login("user1234", "Password")); // no digit
//        assertFalse(app.login("user1234", "password1")); // no uppercase
//    }
//}
//POM.XML
//<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
//xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
//  <modelVersion>4.0.0</modelVersion>
//
//  <groupId>org.example</groupId>
//  <artifactId>SecurityTest</artifactId>
//  <version>1.0-SNAPSHOT</version>
//  <packaging>jar</packaging>
//
//  <name>SecurityTest</name>
//  <url>http://maven.apache.org</url>
//
//  <properties>
//    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
//    <maven.compiler.source>11</maven.compiler.source>
//    <maven.compiler.target>11</maven.compiler.target>
//  </properties>
//  <dependencies>
//    <dependency>
//      <groupId>org.junit.jupiter</groupId>
//      <artifactId>junit-jupiter-api</artifactId>
//      <version>5.8.2</version><scope>test</scope>
//    </dependency>
//  </dependencies>
//</project>
