package org.softrami.movies.controller;

import lombok.RequiredArgsConstructor;
import org.softrami.movies.persitence.entity.Movie;
import org.softrami.movies.service.MovieService;
import org.softrami.movies.util.MovieGenre;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/movies")
public class MovieController {

    private final MovieService movieService;

    @GetMapping
    public List<Movie> findAll(@RequestParam(required = false) String title, @RequestParam(required = false) MovieGenre genre) {

        List<Movie> movies = null;

        if (StringUtils.hasText(title) && genre != null) {
            movies = movieService.findAllByGenreAndTitle(genre, title);
        } else if (StringUtils.hasText(title)) {
            movies = movieService.findAllByTitle(title);
        } else if (genre != null) {
            movies = movieService.findAllByGenre(genre);
        } else {
            movies = movieService.findAll();
        }

        return movies;
    }

/*    @GetMapping(params = {"title", "genre"})
    public List<Movie> findAllByGenreAndTitle(@RequestParam String title, @RequestParam MovieGenre genre) {
        return movieService.findAllByGenreAndTitle(genre, title);
    }

    @GetMapping(params = "genre")
    public List<Movie> findAllByGenre(@RequestParam MovieGenre genre) {
        return movieService.findAllByGenre(genre);
    }

    @GetMapping(params = "title")
    public List<Movie> findAllByTitle(@RequestParam String title) {
        return movieService.findAllByTitle(title);
    }

    @GetMapping(params = {"!title", "!genre"})
    public List<Movie> findAll() {
        return movieService.findAll();
    }*/

    @GetMapping("/{id}")
    public Movie findOneById(@PathVariable Long id) {
        return movieService.findOneById(id);
    }





}
