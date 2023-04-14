package cn.yuyee.shardingsphere.liquibase.demo.repository;

import cn.yuyee.shardingsphere.liquibase.demo.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author yuyee
 * @date 2023/4/14 12:09
 * @description
 */
public interface AddressRepository extends JpaRepository<Address, Long> {
}
