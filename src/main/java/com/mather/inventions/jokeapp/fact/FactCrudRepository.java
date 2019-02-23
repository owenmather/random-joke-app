package com.mather.inventions.jokeapp.fact;

import org.springframework.data.jpa.repository.JpaRepository;

public interface FactCrudRepository extends JpaRepository<Fact,Integer> {
}
