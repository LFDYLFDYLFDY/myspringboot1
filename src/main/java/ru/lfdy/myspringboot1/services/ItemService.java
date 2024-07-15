package ru.lfdy.myspringboot1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lfdy.myspringboot1.entities.Item;
import ru.lfdy.myspringboot1.repositories.ItemRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class ItemService {

    private ItemRepository itemRepository;

    @Autowired
    public void setItemRepository(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    public List<Item> getAllItems() {
//        List<Item> items = new ArrayList<Item>();
        System.out.println(itemRepository.findByTitle("Box"));
        System.out.println(itemRepository.findByCostBetween(40,60));

        return itemRepository.findAll();
    }
}
