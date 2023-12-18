package app.web.service;

import app.web.model.User;

import java.util.List;

public interface UserService {

    void addUser(User user);
    void updateUser(User user1, User user2);
    List<User> listUsers();
    void findById(Long id);
    void removeUser(User user);

}
