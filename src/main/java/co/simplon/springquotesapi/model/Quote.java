package co.simplon.springquotesapi.model;

import javax.persistence.*;

@Entity
public class Quote {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "quote_id_seq")
    @SequenceGenerator(name = "quote_id_seq", allocationSize = 1)
    private int id;

    @Column(name = "content_quote", length = 1000)
    private String content;

    @ManyToOne
    private Character character;

    public Quote(int id, String content, Character character) {
        this.id = id;
        this.content = content;
        this.character = character;
    }

    public Quote() {
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public Character getCharacter() {
        return character;
    }

    @Override
    public String toString() {
        return "Quote {" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
