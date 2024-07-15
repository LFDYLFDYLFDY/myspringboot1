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

    @Column(name = "cost")
    private int cost;

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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
//        return "Item{" +
//                "id=" + id +
//                ", title='" + title + '\'' +
//                '}';
    return String.format("Item [id= %d   title = %s cost = %d]", id, title,cost);
    }
}
