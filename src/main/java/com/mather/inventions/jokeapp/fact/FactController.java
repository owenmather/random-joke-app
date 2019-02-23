package com.mather.inventions.jokeapp.fact;

import com.mather.inventions.jokeapp.joke.Joke;
import com.mather.inventions.jokeapp.joke.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/facts")
public class FactController {

    @Autowired
    FactService factService;

    @GetMapping("/random")
    public String getRandomJoke(Model model){
        List<Fact> facts = factService.getFacts();
        model.addAttribute("facts",facts);

        String test = "test";
        model.addAttribute("test",test);
        return "randomFact"; //this is the randomJoke.html page from templates auto pulled by spring
    }
}
