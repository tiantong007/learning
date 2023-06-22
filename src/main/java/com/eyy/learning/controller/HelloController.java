package com.eyy.learning.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping
    public String hello(){return  "hello get";}

    @PostMapping
    public String hello2(){return  "hello post";}

    @DeleteMapping
    public String hello3(){return  "hello DELETE";}

    @PutMapping
    public String hello4(){return  "hello PUT";}


}
