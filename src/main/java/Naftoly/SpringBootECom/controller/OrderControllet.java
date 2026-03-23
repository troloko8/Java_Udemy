package Naftoly.SpringBootECom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Naftoly.SpringBootECom.model.Order;
import Naftoly.SpringBootECom.model.dto.OrderRequest;
import Naftoly.SpringBootECom.model.dto.OrderResponse;
import Naftoly.SpringBootECom.service.OrderService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/api/orders")
@CrossOrigin
public class OrderControllet {


    @Autowired
    private OrderService orderService;

    @PostMapping("/place")
    public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest) {

        OrderResponse orderResponse = orderService.orderPlace(orderRequest);

        return new ResponseEntity<>(orderResponse, HttpStatus.CREATED);

    }


    @GetMapping("")
    public ResponseEntity<List<OrderResponse>> getAllOrders() {
        List<OrderResponse> orderResponses = orderService.getAllOrdersResponses();
        return new ResponseEntity<>(orderResponses, HttpStatus.OK);
    }

}
