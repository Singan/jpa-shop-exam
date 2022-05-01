import entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emt = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emt.createEntityManager();
        EntityTransaction et = em.getTransaction();

        et.begin();
        Member member = new Member();
        member.setName("나");
        em.persist(member);
        em.flush();
        em.clear();
        Member m1 = em.getReference(Member.class,1L);
        Member m2 = em.find(Member.class,1L);
        System.out.println(m1.getClass()==m2.getClass());
        et.commit();
        em.close();
        emt.close();
    }
}
