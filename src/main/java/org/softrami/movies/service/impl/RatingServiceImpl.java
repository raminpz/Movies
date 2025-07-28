package org.softrami.movies.service.impl;

import org.softrami.movies.exception.ObjectNotFoundException;
import org.softrami.movies.persitence.entity.Rating;
import org.softrami.movies.persitence.repository.RatingCrudRepository;
import org.softrami.movies.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingServiceImpl implements RatingService {
    @Autowired
    private RatingCrudRepository ratingCrudRepository;
    @Override
    public List<Rating> findAll() {
        return ratingCrudRepository.findAll();
    }

    @Override
    public List<Rating> findAllByMovieId(Long movieId) {
        return ratingCrudRepository.findByMovieId(movieId);
    }

    @Override
    public List<Rating> findAllByUserUsername(String username) {
        return ratingCrudRepository.findByUserUsername(username);
    }

    @Override
    public Rating findOneById(Long id) {
        return ratingCrudRepository.findById(id)
                .orElseThrow(()-> new ObjectNotFoundException("[Rating] with id: " + Long.toString(id) + " not found."));
    }

    @Override
    public Rating createOne(Rating rating) {
        return ratingCrudRepository.save(rating);
    }

    @Override
    public Rating updateOneById(Long id, Rating rating) {
        Rating oldRating = this.findOneById(id);
        oldRating.setUserId(rating.getUserId());
        oldRating.setRating(rating.getRating());

        return ratingCrudRepository.save(oldRating);
    }

    @Override
    public void deleteOneById(Long id) {
        if (ratingCrudRepository.existsById(id)) {
            ratingCrudRepository.deleteById(id);
            return;
        }
        throw new ObjectNotFoundException("[Rating] with id: " + Long.toString(id) + " not found.");

    }
}
