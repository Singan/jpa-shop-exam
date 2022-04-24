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
        Book book = new Book();
        book.setName("1번책");
        book.setAuthor("ㅁㄴㅇㅁㄴㅇ");
        book.setIsbn("asdfasdf");
        book.setWriteTime(LocalDateTime.now());
        em.persist(book);


        et.commit();
        em.close();
        emt.close();
    }
}
