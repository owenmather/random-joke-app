package com.mather.inventions.jokeapp.test;

import com.mather.inventions.jokeapp.joke.Joke;
import com.mather.inventions.jokeapp.joke.JokeCrudRepository;
import com.mather.inventions.jokeapp.joke.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/test")
public class testController {

    @GetMapping("/test")
    public String test(Model model){

        return "test"; //this is the randomJoke.html page from templates auto pulled by spring
    }


}
