package com.mather.inventions.jokeapp.fact;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="fact")
public interface FactCrudRepository extends JpaRepository<Fact,Integer> {
}
