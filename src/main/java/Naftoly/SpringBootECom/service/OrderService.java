package Naftoly.SpringBootECom.service;

import java.util.List;

import org.springframework.stereotype.Service;

import Naftoly.SpringBootECom.model.dto.OrderRequest;
import Naftoly.SpringBootECom.model.dto.OrderResponse;

@Service
public class OrderService {

    public OrderResponse orderPlace(OrderRequest orderRequest) {
        return null;
    }

    public List<OrderResponse> getAllOrdersResponses() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllOrders'");
    }

}
