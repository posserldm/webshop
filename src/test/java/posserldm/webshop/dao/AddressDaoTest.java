package posserldm.webshop.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import posserldm.webshop.model.Address;

import java.util.List;

public class AddressDaoTest {

    private ApplicationContext context;
    private AddressDao dao;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        dao = context.getBean(AddressDao.class);
    }

    @Test
    public void find() {
        List<Address> addresses = dao.queryByUsername("东明");
        for (Address address : addresses) {
            System.out.println(address);
        }
    }

    @Test
    public void findAll() {
        List<Address> addresses = dao.queryAll();
        for (Address address : addresses) {
            System.out.println(address);
        }
    }
}
