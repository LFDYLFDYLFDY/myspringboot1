package ru.lfdy.myspringboot1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.lfdy.myspringboot1.entities.Product;
import ru.lfdy.myspringboot1.services.ProductService;

@Controller
@RequestMapping("/products")




public class ProductController {
    private ProductService productService;

  @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String showProductsList(Model model) {
Product product = new Product();
        model.addAttribute("products", productService.getAllProducts());
        model.addAttribute("product", product);
//        System.out.println("getProducts");
        return "products";
//        return "redirect:/index";
    }
    @PostMapping("/add")
    public String addProduct(@ModelAttribute(value = "product") Product product) {
      productService.add(product);
      return "redirect:/products";
    }

    @GetMapping("/add")
    public String addProduct() {
        System.out.println("addProduct");
        return "1";
    }

    @GetMapping("/remove/{id}")
    public String removeProduct() {
        return "1";
    }


    @GetMapping("edit/{id}")
    public String editProduct() {
        return "1";
    }
}
