package org.softrami.movies.service.impl;

import org.softrami.movies.exception.ObjectNotFoundException;
import org.softrami.movies.persitence.entity.User;
import org.softrami.movies.persitence.repository.UserCrudRepository;
import org.softrami.movies.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserCrudRepository userCrudRepository;

    @Override
    public List<User> findAll() {
        return userCrudRepository.findAll();
    }

    @Override
    public List<User> findAllByName(String name) {
        return userCrudRepository.findByNameContaining(name);
    }

    @Override
    public User findOneByUsername(String username) {
        return userCrudRepository.findByUsername(username)
                .orElseThrow(()-> new ObjectNotFoundException("[User] with username: " + username + " not found."));
    }

    @Override
    public User createOne(User user) {
        return userCrudRepository.save(user);
    }

    @Override
    public User updateOneByUsername( String username, User user) {
        User userToUpdate = findOneByUsername(username);
        userToUpdate.setName(user.getName());
        userToUpdate.setPassword(user.getPassword());
        return userCrudRepository.save(userToUpdate);
    }

    @Override
    public void deleteOneByUsername(String username) {
//        User user = this.findOneByUsername(username);
//        userCrudRepository.delete(user);
        if (userCrudRepository.deleteByUsername(username) != 1) {
            throw new ObjectNotFoundException("[User] with username: " + username + " not found.");
        }

    }
}
