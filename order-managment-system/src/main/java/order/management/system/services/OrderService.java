package order.management.system.services;

import order.management.system.dto.OrderDTO;
import order.management.system.model.Order;

import java.util.List;

public interface OrderService {
    List<OrderDTO> getAllOrders();
    OrderDTO getOrderById(Long id);
    String addOrder(Order order);
    String deleteOrder(Long id);
}
