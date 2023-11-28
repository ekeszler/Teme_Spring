package com.example.Teme_Spring.OnlineShop;

import org.springframework.stereotype.Component;

@Component
public class Runner {

    CategoryRepository categoryRepository;
    ProductRepository productRepository;
    CategoryService categoryService;

    ProductService productService;

    public void run(String... args) throws Exception{

    }
}
