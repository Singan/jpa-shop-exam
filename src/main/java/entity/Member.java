package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private Long id;
    @Column(name = "member_name")
    private String name;
    @Column(name = "member_city")
    private String city;
    @Column(name = "member_street")
    private String street;
    @Column(name = "member_zipcode")
    private String zipcode;



    @OneToMany(mappedBy = "member")
    private List<Orders> orders = new ArrayList<>();

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

    public Member() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Orders> getOrder() {
        return orders;
    }

    public void setOrder(List<Orders> orders) {
        this.orders = orders;
    }

}
