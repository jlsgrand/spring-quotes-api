package co.simplon.springquotesapi.controller;

import co.simplon.springquotesapi.model.Movie;
import co.simplon.springquotesapi.repository.MovieRepository;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    private MovieRepository movieRepository;

    public MovieController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    @GetMapping("/filterByDates")
    public List<Movie> getFilteredMoviesByDate(@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate startDate,
                                               @RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate endDate) {
        return movieRepository.findAllByReleaseDateBetween(startDate, endDate);
    }

    @PostMapping
    public void createMovie(@RequestBody Movie movieToCreate) {
        movieRepository.save(movieToCreate);
    }


}
