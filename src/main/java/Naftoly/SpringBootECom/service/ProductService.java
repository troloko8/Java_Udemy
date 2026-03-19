package Naftoly.SpringBootECom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Naftoly.SpringBootECom.model.Product;
import Naftoly.SpringBootECom.repo.ProductRepo;

@Service
public class ProductService {

    @Autowired
    ProductRepo productRepo;

    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
}
