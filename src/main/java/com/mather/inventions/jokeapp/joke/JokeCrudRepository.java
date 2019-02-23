package com.mather.inventions.jokeapp.joke;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JokeCrudRepository extends JpaRepository<Joke,Integer> {
}
