package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
public class Member extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private Long id;
    @Column(name = "member_name")
    private String name;
    @OneToMany(mappedBy = "member")
    private List<Orders> orders = new ArrayList<>();
    @Embedded
    private Address address;
    public void setId(Long id) {
        this.id = id;
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
    public Address getAddress() {
        return address;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", orders=" + orders +
                '}';
    }
}
