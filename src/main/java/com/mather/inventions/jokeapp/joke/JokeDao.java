package com.mather.inventions.jokeapp.joke;

import java.util.List;

public interface JokeDao {
    public List<Joke> selectJokesWithString(String x);
}
