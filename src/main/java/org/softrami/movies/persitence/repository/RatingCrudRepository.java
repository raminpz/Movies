package org.softrami.movies.persitence.repository;

import org.softrami.movies.persitence.entity.Rating;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RatingCrudRepository extends JpaRepository<Rating, Long> {

    List<Rating> findByMovieId(Long movieId);

    List<Rating> findByUserUsername(String username);
}
