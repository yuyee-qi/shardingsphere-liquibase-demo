package cn.yuyee.shardingsphere.liquibase.demo.repository;

import cn.yuyee.shardingsphere.liquibase.demo.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yuyee
 * @date 2023/4/14 12:11
 * @description
 */
public interface OrderRepository extends JpaRepository<Order, Long> {
}
