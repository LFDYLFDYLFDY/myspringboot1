package ru.lfdy.myspringboot1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.lfdy.myspringboot1.entities.Item;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository <Item, Long> {

   Item findByTitle (String title);
   List <Item> findByCostBetween(int min, int max);
//   List <Item> findByCostOrderByTitle (int min, int max);
   @Query(value = "select i  from Item i" )
   List<Item> myMethodName();
   @Query(value = "SELECT i FROM Item  i where  i.title like %?1")
   List<Item> findByTitleEndingWith(String substring);


}
