package posserldm.webshop.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import posserldm.webshop.model.User;

@ContextConfiguration(locations = "classpath:applicationContext.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest {

    @Autowired
    private ApplicationContext context;
    @Autowired
    private UserService service;

    @Test
    public void findOne() {

    }

    @Test
    public void register() {
        User user = context.getBean(User.class);
        user.setUsername("小明");
        user.setPassword("123456");
        user.setPhoneNumber("15107746090");
        user.setEmail("1782342391@qq.com");
        service.register(user);
    }

    @Test
    public void delete() {
        User user = context.getBean(User.class);
        user.setUsername("东明");
        service.delete(user);
    }

    @Test
    public void login() {
        User user = new User();
        user.setUsername("小明");
        user.setPassword("123456");
        Boolean flag = service.login(user);
        System.out.println(flag);
    }



}
