package Naftoly.SpringBootECom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Naftoly.SpringBootECom.model.Order;
import java.util.Optional;


@Repository
public interface OrderRepo extends JpaRepository<Order, Integer> {

    Optional<Order> findByOrderId(String orderId);
}
