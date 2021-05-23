package micwad.movieService.repository;

import micwad.movieService.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    @Override
    Optional<Movie> findById(Long aLong);

    @Override
    List<Movie> findAll();

    @Override
    void delete(Movie movie);

    @Override
    <S extends Movie> S save(S s);

}