import entity.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emt = Persistence.createEntityManagerFactory("hello");
        EntityManager em = emt.createEntityManager();
        EntityTransaction et = em.getTransaction();
        String input = "이무개";
        String query = "select m from Member as m";
        if(input != null)
            query += " where m.name = '" + input+"'";

        Member l =  em.createQuery(query,Member.class).getSingleResult();
        System.out.println(l);
        //et.commit();
        em.close();
        emt.close();
    }
}
