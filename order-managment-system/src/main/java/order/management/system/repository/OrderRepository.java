package order.management.system.repository;

import jdk.jfr.Registered;
import order.management.system.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
