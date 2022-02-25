package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.UserDao;
import web.DAO.UserDaoImpl;
import web.models.User;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserDaoImpl userDaoimpl;

    @Autowired
    public void setUserDao(UserDaoImpl userDaoimpl) {
        this.userDaoimpl = userDaoimpl;
    }


    @Override
    public void addUser(User user) {
        userDaoimpl.addUser(user);
    }

    @Override
    public void deleteUser(Long id) {
        userDaoimpl.deleteUser(id);
    }

    @Override
    public void editUser(User user) {
        userDaoimpl.editUser(user);
    }

    @Override
    public User getUserById(Long id) {
        return userDaoimpl.getUserById(id);

    }

    @Override
    public List<User> getAllUsers() {
        return userDaoimpl.getAllUsers();
    }
}
