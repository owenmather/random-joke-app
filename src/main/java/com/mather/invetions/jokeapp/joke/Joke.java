package com.mather.invetions.jokeapp.joke;

import javax.persistence.*;

@Entity
@Table(name="")//name of database table
public class Joke {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private int id;

    public Joke() {

    }
    public Joke(String jokeDescription) {
        this.jokeDescription = jokeDescription;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "id=" + id +
                ", jokeDescription='" + jokeDescription + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJokeDescription() {
        return jokeDescription;
    }

    public void setJokeDescription(String jokeDescription) {
        this.jokeDescription = jokeDescription;
    }

    @Column(name="")
    private String jokeDescription;
}
