package posserldm.webshop.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import posserldm.webshop.model.MyOrder;

import java.util.Date;
import java.util.Random;

public class OrderServiceTest {

    private ApplicationContext context;
    private OrderService service;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        service = context.getBean(OrderService.class);
    }

    @Test
    public void createOrder() {
        MyOrder order = new MyOrder();
        Random random = new Random(new Date().getTime());
        String[] names = {"python程序设计", "c++程序设计", "java程序设计", "c语言程序设计", "计算机网络", "计算机组成原理", "数据结构与算法"};
        for (int i = 0; i < 20; i++) {
            order.setUsername("小陈");
            order.setPhoneNumber("15107746090");
            order.setAddress("贺州学院");
            order.setState((byte) (random.nextInt(4) + 1));
            order.setGoodsName(names[random.nextInt(7)]);
            int price = random.nextInt(100);
            order.setGoodPrice((double) price);
            order.setGoodsNumber((short) 1);
            order.setCost((double) price);
            order.setImage("images/3.jpg");
            service.add(order);
        }
    }

}
