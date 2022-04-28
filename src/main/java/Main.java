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
        Member m = em.getReference(Member.class,member.getId());
        System.out.println(m.getName());;
        et.commit();
        em.close();
        emt.close();
    }
}
