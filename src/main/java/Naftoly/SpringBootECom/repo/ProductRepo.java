package Naftoly.SpringBootECom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Naftoly.SpringBootECom.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
