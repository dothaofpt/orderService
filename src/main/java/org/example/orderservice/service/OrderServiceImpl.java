package service;

import org.example.orderservice.dto.OrderDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService{
    @Override
    public OrderDTO createOrder(OrderDTO orderDTO) {
        return null;
    }

    @Override
    public Optional<OrderDTO> getOrderById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<OrderDTO> getAllOrders() {
        return null;
    }

    @Override
    public OrderDTO updateOrder(Long id, OrderDTO orderDTO) {
        return null;
    }

    @Override
    public void deleteOrder(Long id) {

    }
}
