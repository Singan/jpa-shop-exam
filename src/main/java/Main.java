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
/*       TypedQuery<People> query = em.createQuery("select p from People p",People.class).setFirstResult(0).setMaxResults(3);
        List<People> people = query.getResultList();*/


        List<Team>  teams = em.createQuery("select t from Team t",Team.class).setMaxResults(6).getResultList();
        for (Team p : teams) {
            System.out.println("p 조회전 ----------------------------");
            System.out.println(p);
        }
        et.commit();


        em.close();
        emt.close();
    }
}
