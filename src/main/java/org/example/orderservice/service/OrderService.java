package service;

import org.example.orderservice.dto.OrderDTO;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    OrderDTO createOrder(OrderDTO orderDTO);

    Optional<OrderDTO> getOrderById(Long id);

    List<OrderDTO> getAllOrders();

    OrderDTO updateOrder(Long id,OrderDTO orderDTO);

    void deleteOrder(Long id);
}
