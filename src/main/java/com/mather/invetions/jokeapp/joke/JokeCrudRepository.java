package com.mather.invetions.jokeapp.joke;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JokeCrudRepository extends JpaRepository<Joke,Integer> {
}
