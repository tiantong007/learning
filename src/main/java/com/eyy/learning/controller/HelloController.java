package com.eyy.learning.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("get")
    public String hello(){return  "hello get";}

    @PostMapping("post")
    public String hello2(){return  "hello post";}

    @DeleteMapping("delete")
    public String hello3(){return  "hello DELETE";}

    @PutMapping("put")
    public String hello4(){return  "hello PUT";}


}
