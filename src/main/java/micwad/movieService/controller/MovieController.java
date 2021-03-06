package micwad.movieService.controller;

import micwad.movieService.model.Movie;
import micwad.movieService.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

//    @GetMapping
//    public ResponseEntity<List<Movie>> findAll() {
//        return ResponseEntity.ok(movieService.findAll());
//    }

    @GetMapping
    public ResponseEntity<List<Movie>> findAllException() {
        /**
        404 HTTP STATUS
         */
 //       return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

        /**
        400 HTTP STATUS
         */
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

        /**
            500 HTTP STATUS
         */

//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        /**
            504 HTTP STATUS connect exception
         */

        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> findById(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Movie> postMovie(@RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.create(movie));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> updateMovie(@RequestBody Movie movie, @PathVariable Long id) {
        return ResponseEntity.ok(movieService.update(movie));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}/true")
    public ResponseEntity<Movie> changeFlag(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.changeFlag(id));
    }

    @PutMapping("/{id}/false")
    public ResponseEntity<Movie> changeFlagFalse(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.changeFlagFalse(id));
    }
}