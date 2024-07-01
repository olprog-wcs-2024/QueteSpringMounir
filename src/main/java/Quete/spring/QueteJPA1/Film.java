package Quete.spring.QueteJPA1;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String actors;
    private Date releaseYear;

    public Film(Long id, String title, String actors, Date releaseYear) {
        this.id = id;
        this.title = title;
        this.actors = actors;
        this.releaseYear = releaseYear;
    }

    public Film() {
    }

    public Long getId() {
        return id;
    }
    
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getActors() {
        return actors;
    }
    public void setActors(String actors) {
        this.actors = actors;
    }
    public Date getReleaseYear() {
        return releaseYear;
    }
    public void setReleaseYear(Date releaseYear) {
        this.releaseYear = releaseYear;
    }
}
