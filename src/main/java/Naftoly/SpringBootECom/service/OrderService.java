package Naftoly.SpringBootECom.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Naftoly.SpringBootECom.model.Order;
import Naftoly.SpringBootECom.model.OrderItem;
import Naftoly.SpringBootECom.model.Product;
import Naftoly.SpringBootECom.model.dto.OrderItemRequest;
import Naftoly.SpringBootECom.model.dto.OrderItemResponse;
import Naftoly.SpringBootECom.model.dto.OrderRequest;
import Naftoly.SpringBootECom.model.dto.OrderResponse;
import Naftoly.SpringBootECom.repo.OrderRepo;
import Naftoly.SpringBootECom.repo.ProductRepo;

@Service
public class OrderService {

    @Autowired
    private OrderRepo orderRepo;
    @Autowired
    private ProductRepo productRepo;

    public OrderResponse orderPlace(OrderRequest request) {
        Order order = new Order();
        String orderId = "ORD" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        order.setOrderId(orderId);
        order.setCustomerName(request.customerName());
        order.setEmail(request.email());
        order.setStatus("PLACED");
        order.setOrderDate(LocalDate.now());

        List<OrderItem> orderItems = new ArrayList<OrderItem>();

        for(OrderItemRequest itemReq : request.items()) {
            Product product = productRepo.findById(itemReq.productId())
                .orElseThrow(() -> new RuntimeException("Product not found: " + itemReq.productId()));

            product.setStockQuantity(product.getStockQuantity() - itemReq.quantity());

            productRepo.save(product);

            OrderItem orderItem = OrderItem.builder()
                .product(product)
                .quantity(itemReq.quantity())
                .totalPrice(product.getPrice().multiply(BigDecimal.valueOf(itemReq.quantity())))
                .order(order)
                .build();

            orderItems.add(orderItem);
        }

        order.setItems(orderItems);

        Order savedOrder = orderRepo.save(order);

        List<OrderItemResponse> itemResponses = new ArrayList<>();
        for(OrderItem item : savedOrder.getItems()) {
            OrderItemResponse itemResponse = new OrderItemResponse(
                item.getProduct().getName(),
                item.getQuantity(),
                item.getTotalPrice()
            );
            itemResponses.add(itemResponse);
        }

        OrderResponse orderResponse = new OrderResponse(
            savedOrder.getOrderId(),
            savedOrder.getCustomerName(),
            savedOrder.getEmail(),
            savedOrder.getStatus(),
            savedOrder.getOrderDate(),
            itemResponses
        );

        return orderResponse;
    }

    public List<OrderResponse> getAllOrdersResponses() {
        List<Order> orders = orderRepo.findAll();
        List<OrderResponse> responses = new ArrayList<>();

        for(Order order : orders) {
            List<OrderItemResponse> itemResponses = new ArrayList<>();
            for(OrderItem item : order.getItems()) {
                OrderItemResponse itemResponse = new OrderItemResponse(
                    item.getProduct().getName(),
                    item.getQuantity(),
                    item.getTotalPrice()
                );
                itemResponses.add(itemResponse);
            }

            OrderResponse orderResponse = new OrderResponse(
                order.getOrderId(),
                order.getCustomerName(),
                order.getEmail(),
                order.getStatus(),
                order.getOrderDate(),
                itemResponses
            );

            responses.add(orderResponse);
        }

        return responses;
    }

}
