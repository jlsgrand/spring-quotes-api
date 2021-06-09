package co.simplon.springquotesapi.controller;

import co.simplon.springquotesapi.model.Quote;
import co.simplon.springquotesapi.repository.QuoteRepository;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/quotes")
public class QuoteController {

    private QuoteRepository quoteRepository;

    public QuoteController(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @GetMapping
    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Quote> getQuoteById(@PathVariable int id) {
//        Optional<Quote> quote = quoteRepository.findById(id);
//        if (quote.isPresent()) {
//            return quote.get();
//        } else {
//            // Il faudrait retourner un code d'erreur propre (on verra ça plus tard).
//            return null;
//        }
        return quoteRepository.findById(id);
    }

    @GetMapping("/filterByContent")
    public List<Quote> getFilteredQuotesByContent(@RequestParam String content) {
        return quoteRepository.findAllByContentContains(content);
    }

    @PostMapping
    public void createQuote(@RequestBody Quote quoteToCreate) {
        quoteRepository.save(quoteToCreate);
    }

    @DeleteMapping("/{id}")
    public void deleteQuote(@PathVariable int id) {
        quoteRepository.deleteById(id);
    }

}
