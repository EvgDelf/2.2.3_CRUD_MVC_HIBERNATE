package app.web.service;

import app.web.dao.UserDao;
import app.web.model.User;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImp implements UserService {

    private final UserDao userDao;

    public UserServiceImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    @Transactional
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    @Transactional
    public void updateUser(User user1, User user2) {
        userDao.updateUser(user1, user2);
    }

    @Override
    @Transactional
    public List<User> listUsers() {
        return userDao.listUsers();
    }

    @Override
    @Transactional
    public void findById(Long id) {
        userDao.findById(id);
    }

    @Override
    @Transactional
    public void removeUser(User user) {
        userDao.removeUser(user);
    }
}
