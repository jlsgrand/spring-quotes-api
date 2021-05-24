package co.simplon.springquotesapi.model;

import javax.persistence.*;

@Entity
public class Quote {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quote_seq")
    private Long id;

    private String content;

    @ManyToOne
    private Character character;

    public Quote() {
    }

    public Quote(Long id, String content, Character character) {
        this.id = id;
        this.content = content;
        this.character = character;
    }

    public Long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Character getCharacter() {
        return character;
    }
}
