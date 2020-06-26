package posserldm.webshop.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import posserldm.webshop.dao.UserDao;
import posserldm.webshop.model.User;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private HibernateTemplate HTemplate;

    @Override
    public void save(User user) {
        HTemplate.save(user);
    }

    @Override
    public void delete(User user) {
        HTemplate.delete(user);
    }

    @Override
    public void update(User user) {
        HTemplate.update(user);
    }

    @Override
    public User queryByUsername(String username) {
        return HTemplate.get(User.class, username);
    }

    @Override
    public List<User> queryAll() {
        return (List<User>) HTemplate.find("from User");
    }
}
