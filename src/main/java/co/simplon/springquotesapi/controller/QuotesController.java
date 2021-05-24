package co.simplon.springquotesapi.controller;

import co.simplon.springquotesapi.model.Quote;
import co.simplon.springquotesapi.repository.QuoteRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/quotes/")
public class QuotesController {

    private QuoteRepository quoteRepository;

    public QuotesController(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    @GetMapping
    public List<Quote> getAllQuotes() {
        return quoteRepository.findAll();
    }
}
