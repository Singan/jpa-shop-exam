import entity.*;
import entity.Enum.OrderStatus;
import org.hibernate.Criteria;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emt = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emt.createEntityManager();
        EntityTransaction et = em.getTransaction();


        et.begin();
        TypedQuery<String> query = em.createQuery("select " +
                "case when m.age >13 then :중 " +
                "when m.age >8 then :초 " +
                "else '외' end " +
                "from Member m ", String.class).
                setParameter("초","초등학생이상").
                setParameter("중","중학생이상");
        List<String> member = query.getResultList();

        for (String m : member) {
            System.out.println(m);
        }
        et.commit();


        em.close();
        emt.close();
    }
}
