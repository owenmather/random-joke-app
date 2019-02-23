package com.mather.inventions.jokeapp.joke;

import javax.persistence.*;

@Entity
@Table(name="joke")//name of database table
public class Joke {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="description")
    private String description;
    public Joke() {

    }
    public Joke(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Joke{" +
                "id=" + id +
                ", description='" + description + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescriptiondescription(String description) {
        this.description = description;
    }


}
