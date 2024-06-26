package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    List<User> getUsersList();

    void addUser(User user);

    void deleteUser(int id);

    void updateUser(User user);

    User getUserById(int id);
}
