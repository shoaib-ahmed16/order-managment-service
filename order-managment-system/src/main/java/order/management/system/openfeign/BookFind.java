package order.management.system.openfeign;


import order.management.system.dto.BookDTO;
import order.management.system.dto.OrderDTO;
import order.management.system.model.Order;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "book-find",url = "http://localhost:8087/api/v1")
public interface BookFind {

    @GetMapping("/books/{id}")
    BookDTO getBookById(@PathVariable("id") Long id);
}
