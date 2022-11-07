package de.neuefische.hellospringcontrollermucjava222.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hi there, hello!";
    }

    @GetMapping("/{name}")
    public String sayHelloTo(@PathVariable String name) {
        return "Hi there, hello " + name + "!";
    }

    @GetMapping("/{name}/and")
    public String sayHelloTo(@PathVariable String name, @RequestParam String name2) {
        return "Hi there, hello " + name + " and " + name2 + "!";
    }

    @GetMapping("/{name}/{name2}")
    public String sayHelloToAndTo(@PathVariable String name, @PathVariable String name2) {
        return "Hi there, hello " + name + " and " + name2 + "!";
    }

}
