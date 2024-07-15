package ru.lfdy.myspringboot1.controllers;

//import com.sun.tools.javac.jvm.Items;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lfdy.myspringboot1.services.ItemService;
import org.springframework.web.bind.annotation.*;


@Controller
//@RequestMapping("/items")
public class ItemsController {
    private ItemService itemService;

    @Autowired
    public void setItemService(ItemService itemService) {
        this.itemService = itemService;
    }
//    @RequestMapping("/items")
@GetMapping("/items")

    public String showItemsPage(Model model) {
        model.addAttribute("items", itemService.getAllItems());
        return "items";
    }
}
