package org.softrami.movies.service;

import org.softrami.movies.persitence.entity.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    List<User> findAllByName(String name);
    User findOneByUsername(String username);
    User createOne(User user);
    User updateOneByUsername(String username, User user);
    void deleteOneByUsername(String username);
}
