package entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Entity
public class Category extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="category_id")
    private Long id;
    @Column(name="category_name")
    private String name;

    @JoinColumn(name="parent_id")
    @ManyToOne(fetch = LAZY)
    private Category parent;

    @OneToMany(mappedBy = "parent",fetch = LAZY)
    private List<Category> child = new ArrayList<>();

    @ManyToMany(fetch = LAZY)
    @JoinTable(name="CATEGORY_ITEM",
        joinColumns = @JoinColumn(name = "CATEGORY_ID"),
            inverseJoinColumns = @JoinColumn(name = "ITEM_ID")
    )
    private List<Item> items = new ArrayList<>();
}
