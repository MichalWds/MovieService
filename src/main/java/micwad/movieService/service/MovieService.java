package micwad.movieService.service;

import micwad.movieService.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    public List<Movie> findAll() {
        return List.of(new Movie(1L, "filmJakis", "horror"));
    }
}
