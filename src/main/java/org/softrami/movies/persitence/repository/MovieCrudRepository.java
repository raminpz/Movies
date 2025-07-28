package org.softrami.movies.persitence.repository;

import org.softrami.movies.persitence.entity.Movie;
import org.softrami.movies.util.MovieGenre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MovieCrudRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByTitleContaining(String title);

    List<Movie> findByGenre(MovieGenre genre);

    List<Movie> findByGenreAndTitleContaining(MovieGenre genre, String title);


}
