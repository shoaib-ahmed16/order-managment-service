package order.management.system.controller;

import order.management.system.dto.OrderDTO;
import order.management.system.model.Order;
import order.management.system.services.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/api/v1")
public class OrderController {

    private OrderService orderService;

    public OrderController(OrderService orderService){
        this.orderService=orderService;
    }

    @GetMapping("/orders")
    public ResponseEntity<List<OrderDTO>> getAllOrderDetails(){
        return new ResponseEntity<List<OrderDTO>>(orderService.getAllOrders(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/orders/{id}")
    public ResponseEntity<OrderDTO> getAllOrderDetails(@PathVariable("id") Long id){
        return new ResponseEntity<OrderDTO>(orderService.getOrderById(id), HttpStatus.ACCEPTED);
    }

    @PostMapping("/orders")
    public ResponseEntity<String> addOrder(@RequestBody Order order){
        return new ResponseEntity<>(orderService.addOrder(order),HttpStatus.CREATED);
    }
   /* @PutMapping("orders/{id}")
    public ResponseEntity<String> updateOrder(@RequestBody Order order, @PathVariable("id") Long id){
        return new ResponseEntity<>("Updated",HttpStatus.ACCEPTED);
    }*/

    @DeleteMapping("orders/{id}")
    public  ResponseEntity<String> deleteOrder(@PathVariable("id") Long id){
        return new ResponseEntity<>("delete",HttpStatus.ACCEPTED);
    }
}

