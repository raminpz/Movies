package org.softrami.movies.controller;

import lombok.RequiredArgsConstructor;
import org.softrami.movies.persitence.entity.Movie;
import org.softrami.movies.persitence.entity.User;
import org.softrami.movies.service.UserService;
import org.softrami.movies.util.MovieGenre;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<User> findAllByName(@RequestParam(required = false) String name) {

        List<User> users = null;

        if (StringUtils.hasText(name)) {
            users = userService.findAllByName(name);
        } else {
            users = userService.findAll();
        }

        return users;
    }

    @GetMapping("/{username}")
    public User findOneByUsername(@PathVariable String username) {
        return userService.findOneByUsername(username);
    }
}
