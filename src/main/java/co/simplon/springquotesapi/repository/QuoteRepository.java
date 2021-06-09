package co.simplon.springquotesapi.repository;

import co.simplon.springquotesapi.model.Quote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuoteRepository extends JpaRepository<Quote, Integer> {

    List<Quote> findAllByContentContains(String content);

}
