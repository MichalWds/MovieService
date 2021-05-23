package micwad.movieService.service;

import micwad.movieService.model.Movie;
import micwad.movieService.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findById(Long id) {
        Optional<Movie> movie = movieRepository.findById(id);
        if (movie.isPresent()) {
            return movie;
        } else {
            throw new RuntimeException();
        }
    }

    public Movie update(Movie movie) {
        if (movie.getId() > 0) {
            return movieRepository.save(movie);
        } else {
            throw new RuntimeException();
        }
    }

    public Movie create(Movie movie) {
        return movieRepository.save(movie);
    }

    public void deleteMovie(Long id) {
        if (movieRepository.findById(id).isPresent()) {
            movieRepository.deleteById(id);
        } else {
            throw new RuntimeException();
        }
    }
}
