package co.simplon.springquotesapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
public class Character {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "character_id_seq")
    @SequenceGenerator(name = "character_id_seq", allocationSize = 1)
    private int id;

    private String name;

    @ManyToOne
    private Movie movie;

    @JsonIgnore
    @OneToMany(mappedBy = "character")
    private List<Quote> quoteList;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Movie getMovie() {
        return movie;
    }

    public List<Quote> getQuoteList() {
        return quoteList;
    }
}
