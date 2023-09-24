package order.management.system.dto;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import order.management.system.enumclass.OrderStatus;


public class OrderDTO {

    private  Long id;
    private String customerName;
    private BookDTO book;

    private String orderStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public BookDTO getBook() {
        return book;
    }

    public void setBook(BookDTO book) {
        this.book = book;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }
    public OrderDTO(){

    }
}
