package posserldm.webshop.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import posserldm.webshop.model.Address;

public class AddressServiceTest {

    private ApplicationContext context;
    private AddressService dao;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        dao = context.getBean(AddressService.class);
    }

    @Test
    public void add() {
        Address address = context.getBean(Address.class);
        address.setAddress("贺州学院本校");
        address.setUsername("李东明");
        dao.add(address);
    }

    @Test
    public void deleteByName() {
        dao.delete("东明");
    }
}
