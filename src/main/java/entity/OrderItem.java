package entity;

import javax.persistence.*;

@Entity
public class OrderItem {
    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @JoinColumn(name = "order_id")
    @ManyToOne
    private Orders orders;
    @JoinColumn(name = "item_id")
    @ManyToOne
    private Item item;
    @Column(name = "order_price")
    private Integer orderPrice;
    @Column(name = "order_item_count")
    private Integer count;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Orders getOrder() {
        return orders;
    }

    public void setOrder(Orders orders) {
        this.orders = orders;
    }

    public Item getItemId() {
        return item;
    }

    public void setItemId(Item itemId) {
        this.item = itemId;
    }

    public Integer getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(Integer orderPrice) {
        this.orderPrice = orderPrice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public OrderItem() {
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "id=" + id +
                ", orders=" + orders +
                ", item=" + item +
                ", orderPrice=" + orderPrice +
                ", count=" + count +
                '}';
    }
}
