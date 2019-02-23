package com.mather.inventions.jokeapp.joke;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class JokeService {

    @Autowired
    private JokeCrudRepository jokeCrudRepository;

    public Joke getJokeById(int id){
        Optional<Joke> joke = jokeCrudRepository.findById(id);

        if(joke.isPresent()){
            return joke.get();
        }else{
            return new Joke();
        }
    }

}
