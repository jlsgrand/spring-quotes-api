package co.simplon.springquotesapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "movie_id_seq")
    @SequenceGenerator(name = "movie_id_seq", allocationSize = 1)
    private int id;

    private String name;

    private LocalDate releaseDate;

    @JsonIgnore
    @OneToMany(mappedBy = "movie")
    private List<Character> characterList;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public List<Character> getCharacterList() {
        return characterList;
    }
}
