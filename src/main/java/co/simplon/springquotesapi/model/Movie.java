package co.simplon.springquotesapi.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_seq")
    private Long id;

    private String title;

    private LocalDate releaseDate;

    @OneToMany(mappedBy = "movie")
    private List<Character> characters = new ArrayList<>();

    public Movie(Long id, String title, LocalDate releaseDate, List<Character> characters) {
        this.id = id;
        this.title = title;
        this.releaseDate = releaseDate;
        this.characters = characters;
    }

    public Movie() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public List<Character> getCharacters() {
        return characters;
    }
}
