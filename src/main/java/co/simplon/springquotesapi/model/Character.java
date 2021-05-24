package co.simplon.springquotesapi.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_seq")
    private Long id;

    private String name;

    @ManyToOne
    private Movie movie;

    @OneToMany(mappedBy = "character")
    private List<Quote> quotes = new ArrayList<>();

    public Character() {
    }

    public Character(Long id, String name, Movie movie, List<Quote> quotes) {
        this.id = id;
        this.name = name;
        this.movie = movie;
        this.quotes = quotes;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Movie getMovie() {
        return movie;
    }

    public List<Quote> getQuotes() {
        return quotes;
    }
}
