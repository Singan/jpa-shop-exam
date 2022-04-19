import entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emt = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emt.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Item item =em.find(Item.class,2L);


        OrderItem oi = new OrderItem();
        oi.setItemId(item);
        oi.setOrderPrice(50000);
        Orders orders = em.find(Orders.class, 3L);
        for (int i = 0;i<orders.getOrderItemList().size();i++) {
            System.out.println(i);
        }
        orders.addOrderItem(oi);
        for (int i = 0;i<orders.getOrderItemList().size();i++) {
            System.out.println(i);
        }
        et.commit();
        em.close();
        emt.close();
    }
}
