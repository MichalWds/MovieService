package micwad.movieService.service;

import micwad.movieService.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

import static micwad.movieService.model.Category.*;

@Service
public class MovieService {

//    private MovieRepository movieRepository;
//
//    public MovieService(MovieRepository movieRepository) {
//        this.movieRepository = movieRepository;
//    }

    public List<Movie> findAll() {
        return List.of(new Movie(1L, "filmJakis", HORROR), new Movie(2L, "filmJakis2", HORROR));
    }

    public Movie findById() {
        return new Movie(1L, "filmJakis", COMEDY);
    }

    public Movie update(Movie movie) {
        return movie;
    }

    public Movie create(Movie movie) {
        return movie;
    }

    public void deleteMovie(Long id){
    }
}
