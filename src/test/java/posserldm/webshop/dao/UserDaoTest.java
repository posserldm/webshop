package posserldm.webshop.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import posserldm.webshop.model.User;

import java.util.List;

public class UserDaoTest {
    private ApplicationContext context;
    private UserDao dao;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        dao = (UserDao) context.getBean(UserDao.class);
    }

    @Test
    public void runTest() {
        System.out.println("hello world");
    }

    @Test
    public void findAll() {
        List<User> users = dao.queryAll();
        for (User user : users) {
            System.out.println(user);
        }
    }

    @Test
    public void findByUsername() {
        User user = dao.queryByUsername("李东明");
        System.out.println(user);
    }

}
