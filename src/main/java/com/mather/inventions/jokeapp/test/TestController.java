package com.mather.inventions.jokeapp.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public String test(){
        return "test"; //this is the randomJoke.html page from templates auto pulled by spring
    }


}
