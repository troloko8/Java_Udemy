package Naftoly.SpringBootECom.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class OrderItem {
    @Id
    private int id;

    @ManyToOne
    private Product product;

    private int quantety;

    private BigDecimal totalPrice;


    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;
}
