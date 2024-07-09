package ru.lfdy.myspringboot1.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.lfdy.myspringboot1.entities.Product;
import ru.lfdy.myspringboot1.repositories.ProductRepository;

import java.util.List;



public class ProductService {


    @Service
    public class ProductsService {
        private ProductRepository productRepository;

        @Autowired
        public void setProductRepository(ProductRepository productRepository) {
            this.productRepository = productRepository;
        }

        public Product getById(Long id) {
            return productRepository.findById(id);
        }

        public List<Product> getAllProducts() {
            return productRepository.findAll();
        }

        public void add(Product product) {
            productRepository.save(product);
        }
    }

}
