package Naftoly.SpringBootECom.model.dto;

public record OrderItemRequest(
    int productId,
    int quantity
) {}
