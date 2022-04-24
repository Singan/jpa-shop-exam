package entity;

import entity.Enum.DeliveryStatus;

import javax.persistence.*;

@Entity
public class Delivery extends BaseEntity{
    @Id @GeneratedValue
    @Column(name = "delivery_id")
    private Long id;
    @Column(name = "delivery_city")
    private String city;
    @Column(name = "delivery_street")
    private String street;
    @Column(name = "delivery_zipcode")
    private String zipcode;
    @Enumerated
    @Column(name = "delivery_status")
    private DeliveryStatus deliveryStatus;

    @OneToOne(mappedBy = "delivery")
    private Orders orders;
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public DeliveryStatus getDeliveryStatus() {
        return deliveryStatus;
    }

    public void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
    }
}
