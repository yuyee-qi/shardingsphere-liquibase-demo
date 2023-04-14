package cn.yuyee.shardingsphere.liquibase.demo.entity;

import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "t_order_item")
@DynamicUpdate
public class OrderItem implements Serializable {

    private static final long serialVersionUID = 1332162822494069342L;

    @Id
    @Column(name = "order_item_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderItemId;

    @Column(name = "order_id")
    private long orderId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "phone")
    private String phone;

    @Column(name = "file_date", updatable = false)
    private LocalDate fileDate;

    @Column(name = "status")
    private String status;

    public long getOrderItemId() {
        return orderItemId;
    }

    public void setOrderItemId(final long orderItemId) {
        this.orderItemId = orderItemId;
    }

    public long getOrderId() {
        return orderId;
    }

    public void setOrderId(final long orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(final int userId) {
        this.userId = userId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    public LocalDate getFileDate() {
        return fileDate;
    }

    public void setFileDate(LocalDate fileDate) {
        this.fileDate = fileDate;
    }

    @Override
    public String toString() {
        return String.format("order_item_id:%s, order_id: %s, user_id: %s, phone: %s, status: %s", orderItemId, orderId, userId, phone, status);
    }
}
