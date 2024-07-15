package ru.lfdy.myspringboot1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.lfdy.myspringboot1.entities.Item;

public interface ItemRepository extends JpaRepository <Item, Long> {


}
