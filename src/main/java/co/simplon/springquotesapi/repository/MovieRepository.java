package co.simplon.springquotesapi.repository;

import co.simplon.springquotesapi.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Integer> {

    List<Movie> findAllByReleaseDateBetween(LocalDate startDate, LocalDate endDate);

}
