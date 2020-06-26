package posserldm.webshop.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import posserldm.webshop.model.MyOrder;

import java.util.List;

public class OrderDaoTest {
    private ApplicationContext context;
    private OrderDao dao;
    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        dao = context.getBean(OrderDao.class);
    }
    @Test
    public void run() {
        List<MyOrder> list = dao.queryByUsername("东明");
        for (MyOrder myOrder : list) {
            System.out.println(myOrder);
        }
    }

    @Test
    public void findAll() {
        List<MyOrder> myOrders = dao.queryAll();
        for (MyOrder myOrder : myOrders) {
            System.out.println(myOrder);
        }
    }

    public void findOne() {
        MyOrder myOrder = dao.queryById(1);
        System.out.println(myOrder);
    }
}
