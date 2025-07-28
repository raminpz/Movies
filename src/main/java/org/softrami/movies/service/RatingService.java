package org.softrami.movies.service;

import org.softrami.movies.persitence.entity.Rating;

import java.util.List;

public interface RatingService {
    List<Rating> findAll();
    List<Rating> findAllByMovieId(Long movieId);
    List<Rating> findAllByUserUsername(String username);
    Rating findOneById(Long id);
    Rating createOne(Rating rating);
    Rating updateOneById(Long id, Rating rating);
    void deleteOneById(Long id);
}
