package de.neuefische.hellospringcontrollermucjava222.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class HelloController {

    // Daten anfordern
    @GetMapping
    public String sayHello() {
        return "Hello World!";
    }

    @GetMapping("/{lieblingsCurrywurstBudde}")
    public String sayHello(@PathVariable String lieblingsCurrywurstBudde) {
        return "Deine geliebteste Currywurstbudde lautet: " + lieblingsCurrywurstBudde;
    }

    // Daten verschicken
    @PostMapping
    public String acceptHello(@RequestBody String request) {
        return "Hi, deine Anfrage war: " + request;
    }
}
