package order.management.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class OrderManagmentSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderManagmentSystemApplication.class, args);
    }

}
