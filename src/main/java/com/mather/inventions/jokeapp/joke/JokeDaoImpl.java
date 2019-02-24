package com.mather.inventions.jokeapp.joke;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
public class JokeDaoImpl implements JokeDao{


    EntityManager entityManager;

    //constructor injection
    @Autowired
    public JokeDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Joke> selectJokesWithString(String x) {
        Session session = entityManager.unwrap(Session.class);
        Query theQuery = session.createQuery("From Joke where description like :description");
        theQuery.setParameter("description","%"+x+"%");
        return theQuery.getResultList();
    }
}
