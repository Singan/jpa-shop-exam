package entity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Movie extends Item{
    @Column(name="movie_director")
    private String director;
    @Column(name="movie_actor")
    private String actor;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }
}
