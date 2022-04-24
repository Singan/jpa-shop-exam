package entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Book extends Item{
    @Column(name="book_author")
    private String author;
    @Column(name="book_isbn")
    private String isbn;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
