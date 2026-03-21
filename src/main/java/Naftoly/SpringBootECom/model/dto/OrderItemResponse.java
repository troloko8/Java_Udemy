package Naftoly.SpringBootECom.model.dto;

import java.math.BigDecimal;

public record OrderItemResponse(
    String productName,
    int quantety,
    BigDecimal totalPrice
) {}
