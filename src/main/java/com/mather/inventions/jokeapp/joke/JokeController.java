package com.mather.inventions.jokeapp.joke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jokes")
public class JokeController {

    @Autowired
    JokeService jokeService;

    @GetMapping("/random")
    public String getRandomJoke(Model model){
        int i = (int)Math.random()*3;
        Joke joke = jokeService.getJokeById(i);
        model.addAttribute("joke",joke);
        return "randomJoke"; //this is the randomJoke.html page from templates auto pulled by spring
    }
}
