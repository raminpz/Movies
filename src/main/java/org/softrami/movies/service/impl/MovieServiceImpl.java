package org.softrami.movies.service.impl;

import org.softrami.movies.exception.ObjectNotFoundException;
import org.softrami.movies.persitence.entity.Movie;
import org.softrami.movies.persitence.repository.MovieCrudRepository;
import org.softrami.movies.service.MovieService;
import org.softrami.movies.util.MovieGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{

    @Autowired
    private MovieCrudRepository movieCrudRepository;


    @Override
    public List<Movie> findAll() {
        return movieCrudRepository.findAll();
    }

    @Override
    public List<Movie> findAllByTitle(String title) {
        return movieCrudRepository.findByTitleContaining(title);
    }

    @Override
    public List<Movie> findAllByGenre(MovieGenre genre) {
        return movieCrudRepository.findByGenre(genre);
    }

    @Override
    public List<Movie> findAllByGenreAndTitle(MovieGenre genre, String title) {
        return movieCrudRepository.findByGenreAndTitleContaining(genre, title);
    }

    @Override
    public Movie findOneById(Long id) {
        return movieCrudRepository.findById(id)
                .orElseThrow(()-> new ObjectNotFoundException("[Movie] with id: " + Long.toString(id) + " not found."));
    }

    @Override
    public Movie createOne(Movie movie) {
        return movieCrudRepository.save(movie);
    }

    @Override
    public Movie updateOneById(Long id, Movie movie) {
        Movie oldMovie = this.findOneById(id);

        oldMovie.setTitle(movie.getTitle());
        oldMovie.setDirector(movie.getDirector());
        oldMovie.setGenre(movie.getGenre());
        oldMovie.setReleaseYear(movie.getReleaseYear());

        return movieCrudRepository.save(oldMovie);
    }

    @Override
    public void deleteOneById(Long id) {
        Movie movie = this.findOneById(id);

        movieCrudRepository.delete(movie);
    }
}
