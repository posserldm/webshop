package posserldm.webshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import posserldm.webshop.dao.AddressDao;
import posserldm.webshop.dao.OrderDao;
import posserldm.webshop.dao.UserDao;
import posserldm.webshop.model.User;
import posserldm.webshop.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private AddressDao addressDao;
    @Autowired
    private OrderDao orderDao;

    @Override
    public void register(User user) {
        userDao.save(user);
    }

    @Override
    public void resetPassword(User user) {
        userDao.update(user);
    }

    @Override
    public void delete(User user) {
        addressDao.delete(user.getUsername());
        orderDao.delete(user.getUsername());
        userDao.delete(user);
    }

    @Override
    public Boolean login(User user) {
        User user1 = userDao.queryByUsername(user.getUsername());
        return user1 != null && user1.getPassword().equals(user.getPassword());
    }

    @Override
    public List<User> showAllUsers() {
        return userDao.queryAll();
    }
}
