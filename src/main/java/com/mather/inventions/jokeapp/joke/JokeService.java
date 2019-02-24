package com.mather.inventions.jokeapp.joke;

import com.mather.inventions.jokeapp.fact.Fact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JokeService {

    @Autowired
    private JokeCrudRepository jokeCrudRepository;

    @Autowired
    private JokeDaoImpl jokeDao;

    public Joke getJokeById(int id){
        Optional<Joke> joke = jokeCrudRepository.findById(id);

        if(joke.isPresent()){
            return joke.get();
        }else{
            return new Joke();
        }
    }

    public void save(Joke joke) {
       jokeCrudRepository.save(joke);
    }

    public List<Joke> getJokes(){
        List<Joke> jokes = jokeCrudRepository.findAll();
        return jokes;
    }

    public List<Joke> getJokesWithString(String s){
        List<Joke> jokes = jokeDao.selectJokesWithString(s);
        return jokes;
    }
}
