/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.g2academy.bootcamp.controller;

import co.g2academy.bootcamp.model.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author cimiko
 */
@RestController
@RequestMapping("/api")
public class RestApiController {
    
    @GetMapping("/product")
    public List<Product> getProducts(){
        return createDummyProducts();
    }

    
    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable Integer id){
        Product p = new Product();
        p.setId(id);
        p.setName("Product-" + id);
        p.setCategoryId(0);
        p.setPrice(id * 10_000);
        return p;
    }
    
    @PostMapping("/product")
    public Product saveProduct(@RequestBody Product p){
        //Save dummy
        Product response = new Product();
        response.setId(1);
        response.setName(p.getName());
        response.setCategoryId(0);
        response.setPrice(p.getPrice());
        return response;
    }
    
    @PutMapping("product/{id}")
    public Product updateProduct(@PathVariable Integer id, @RequestBody Product p){
        //dummy code to update the database
        return p;
    }
    
    @DeleteMapping("/product/{id}")
    public Product deleteProduct(@PathVariable Integer id){
        Product p = new Product();
        p.setId(id);
        p.setName("Product-" + id);
        p.setCategoryId(0);
        p.setPrice(id * 10_000);
        return p;
    }
    
    @DeleteMapping("/product")
    public List<Product> deleteProducts(){
        return createDummyProducts();
    }
    
    private List<Product> createDummyProducts(){
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Product p = new Product();
            p.setId(i);
            p.setName("Product-" + i);
            p.setCategoryId(0);
            p.setPrice(i * 10_000);
            products.add(p); 
        }
        return products;
    }
    
}
