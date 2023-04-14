package cn.yuyee.shardingsphere.liquibase.demo.repository;

import cn.yuyee.shardingsphere.liquibase.demo.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yuyee
 * @date 2023/4/14 12:14
 * @description
 */
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
