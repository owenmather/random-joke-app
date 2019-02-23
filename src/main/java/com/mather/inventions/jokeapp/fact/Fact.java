package com.mather.inventions.jokeapp.fact;

import javax.persistence.*;

@Entity
@Table(name="fact")//name of database table
public class Fact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @Column(name="description")
    private String description;
    public Fact() {

    }
    public Fact(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Fact{" +
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
