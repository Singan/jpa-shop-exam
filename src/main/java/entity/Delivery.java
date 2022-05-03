package entity;

import entity.Enum.DeliveryStatus;

import javax.persistence.*;

import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
public class Delivery extends BaseEntity{
    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;
    @Embedded
    private Address address;
    @Enumerated
    @Column(name = "delivery_status")
    private DeliveryStatus deliveryStatus;

    @OneToOne(mappedBy = "delivery",fetch = LAZY)
    private Orders orders;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    public Orders getOrders() {
        return orders;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
