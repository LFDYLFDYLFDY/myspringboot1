package ru.lfdy.myspringboot1.entities;


import javax.persistence.*;


@Entity
@Table(name="items")
public class Item {
    @Id
    @Column(name = "id")

//            @GeneratedValue
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column
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

    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return title;
    }
}
