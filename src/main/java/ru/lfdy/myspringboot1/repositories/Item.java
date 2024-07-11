package ru.lfdy.myspringboot1.repositories;


import org.springframework.data.annotation.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;


@Entity
@Table(name="items")
public class Item {
    @Id
            @GeneratedValue
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

}
