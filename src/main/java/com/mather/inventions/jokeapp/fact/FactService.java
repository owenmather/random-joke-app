package com.mather.inventions.jokeapp.fact;

import com.mather.inventions.jokeapp.joke.Joke;
import com.mather.inventions.jokeapp.joke.JokeCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FactService {

    @Autowired
    private FactCrudRepository factCrudRepository;

    public List<Fact> getFacts(){
        List<Fact> fact = factCrudRepository.findAll();
        return fact;
    }

}
