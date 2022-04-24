package entity;

import entity.Enum.OrderStatus;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Orders extends BaseEntity{
    @Id @GeneratedValue
    @Column(name="order_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name="member_id")
    private Member member;

    @OneToMany(mappedBy = "orders")
    private List<OrderItem> orderItemList = new ArrayList<>();

    @Column(name="order_date")
    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    @Column(name="order_status")
    private OrderStatus orderStatus;

    @JoinColumn(name="delivery_id")
    @OneToOne
    private Delivery delivery;

    public Orders() {
    }
    public void addOrderItem(OrderItem orderItem){
        orderItemList.add(orderItem);
        orderItem.setOrder(this);

    }
    public List<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(List<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
