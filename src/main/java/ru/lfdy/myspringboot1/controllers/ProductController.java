package ru.lfdy.myspringboot1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/delete/{id}")
    public String deleteProduct( @PathVariable(value = "id") Long id) {
        Product product = productService.getById(id);
//        model.addAttribute("product", product);
productService.deleteByID(id);
        return "redirect:/products";
    }


    @GetMapping("/show/{id}")

    public String showOneProduct(Model model, @PathVariable(value = "id") Long id) {
            Product product = productService.getById(id);
            model.addAttribute("product", product);
            return "product-page";

        }
}
