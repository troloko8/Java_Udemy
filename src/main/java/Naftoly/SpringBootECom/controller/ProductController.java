package Naftoly.SpringBootECom.controller;

import org.springframework.web.bind.annotation.RestController;

import Naftoly.SpringBootECom.model.Product;
import Naftoly.SpringBootECom.service.ProductService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/api")
@CrossOrigin
public class ProductController {

    @Autowired
    private ProductService productService;
    
    @GetMapping("/products")
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
    
}
