package micwad.movieService.service;

import micwad.movieService.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

//    private MovieRepository movieRepository;
//
//    public MovieService(MovieRepository movieRepository) {
//        this.movieRepository = movieRepository;
//    }

    public List<Movie> findAll() {
        return List.of(new Movie(1L, "filmJakis", "horror"), new Movie(2L, "filmJakis2", "komedia"));
    }

    public Movie findById() {
        return new Movie(1L, "filmJakis", "horror");
    }
}
