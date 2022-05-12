package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
@NamedQuery(name = "member.find",query = "select m from Member m where m.id = :member")
public class Member extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "member_id")
    private Long id;
    @Column(name = "member_name")
    private String name;
    @Column(name = "member_age")
    private Long age;
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

    public Long getAge() {
        return age;
    }

    public void setAge(Long age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", orders=" + orders +
                ", address=" + address +
                '}';
    }
}
