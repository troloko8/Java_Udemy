package Naftoly.SpringBootECom.repo;

import java.util.List;

import org.antlr.v4.runtime.atn.SemanticContext.OR;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import Naftoly.SpringBootECom.model.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {
    
@Query("SELECT p FROM Product p WHERE " +
       "LOWER(p.name) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
       "LOWER(p.description) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
       "LOWER(p.brand) LIKE LOWER(CONCAT('%', :keyword, '%')) OR " +
       "LOWER(p.category) LIKE LOWER(CONCAT('%', :keyword, '%'))")
List<Product> searchProducts(@Param("keyword") String keyword);

}
