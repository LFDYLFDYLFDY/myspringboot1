package ru.lfdy.myspringboot1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.lfdy.myspringboot1.entities.Item;

@Repository
public interface ItemRepository extends JpaRepository <Item, Long> {


}
