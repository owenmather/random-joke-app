package com.mather.inventions.jokeapp.joke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Controller
@RequestMapping("/jokes")
public class JokeController {

    @Autowired
    JokeService jokeService;

    @Autowired
    JokeCrudRepository jokeCrudRepository;

    @GetMapping("/random")
    public String getRandomJoke(Model model){
        Random rand = new Random();
        int randomNum = rand.nextInt(((int)jokeCrudRepository.count() - 1) + 1) + 1;

        Joke joke = jokeService.getJokeById(randomNum);
        model.addAttribute("joke",joke);

        return "randomJoke"; //this is the randomJoke.html page from templates auto pulled by spring
    }

    @PostMapping("/save")
    public String add(@Valid @ModelAttribute("myjoke") Joke joke , BindingResult bindingResult){
        if (bindingResult.hasErrors()) {
            return "param";
        }
        jokeService.save(joke);
        return "redirect:/jokes/list";
    }

    @GetMapping("/addForm")
    public String getForm(Model model){
        Joke myjoke = new Joke();
        model.addAttribute("myjoke",myjoke);
        return "addJoke.html";
    }

    @GetMapping("/list")
    public String listJokes(Model model){
        List<Joke> jokes = jokeService.getJokes();
        model.addAttribute("jokes",jokes);
        return "jokeList.html";
    }

    @GetMapping("/updateform")
    public String getUpdate(@RequestParam("jokeId") int id, Model model){
        Optional<Joke> car =jokeCrudRepository.findById(id);
        model.addAttribute("myjoke",car.get());
        return "addJoke.html";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("jokeId") int id){
        jokeCrudRepository.deleteById(id);
        return "redirect:/jokes/list";
    }
}
