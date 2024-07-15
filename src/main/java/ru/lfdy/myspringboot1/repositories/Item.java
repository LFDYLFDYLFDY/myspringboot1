package ru.lfdy.myspringboot1.repositories;


import org.springframework.data.annotation.*;
import org.springframework.data.annotation.Id;

import javax.persistence.*;


@Entity
@Table(name="items")
public class Item {
    @javax.persistence.Id
    @Id
//            @GeneratedValue
    @GeneratedValue(strategy = GenerationType.IDENTITY)
            @Column(name = "id")
    private  Long id;
    @Column(name = "title")
    private  String title;

    public Item() {
    }

    public Item(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
