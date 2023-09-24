package order.management.system.services.impl;

import order.management.system.dto.BookDTO;
import order.management.system.dto.OrderDTO;
import order.management.system.exception.OrderNotFoundException;
import order.management.system.model.Order;
import order.management.system.openfeign.BookFind;
import order.management.system.repository.OrderRepository;
import order.management.system.services.OrderService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {
    private OrderRepository orderRepository;
    private BookFind bookFind;
    public OrderServiceImpl(OrderRepository orderRepository,BookFind bookFind){
        this.orderRepository =orderRepository;
        this.bookFind=bookFind;
    }
    @Override
    public List<OrderDTO> getAllOrders() {
        List<Order>  orderList =orderRepository.findAll();
        return null;
    }

    @Override
    public OrderDTO getOrderById(Long id) {
        Optional<Order> order = orderRepository.findById(id);
        if(order.isPresent()){
            Order opt = order.get();
            BookDTO book = bookFind.getBookById(opt.getBookId());
            System.out.println(book);
            OrderDTO orderDTO = new OrderDTO();
            orderDTO.setId(opt.getId());
            orderDTO.setOrderStatus(opt.getOrderStatus());
            orderDTO.setCustomerName(opt.getCustomerName());
            orderDTO.setBook(book);
            return orderDTO;
        }
        throw new OrderNotFoundException("Order not found for Id: "+id);
    }

    @Override
    public String addOrder(Order order) {
        if(order!=null){
            orderRepository.save(order);
            return "Order is saved Successfully!!!";
        }
        throw new OrderNotFoundException("Getting Null  in place of an Object");
    }

    @Override
    public String deleteOrder(Long id) {
        Optional<Order> opt =orderRepository.findById(id);
        if(opt.isPresent()){
            Order order = opt.get();
            orderRepository.delete(order);
            return "Order Deleted Successfully for Id: "+id;
        }
        throw new OrderNotFoundException("Order not found for Id: "+id);
    }
}
