package posserldm.webshop.dao;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import posserldm.webshop.model.Goods;

import java.util.List;

public class GoodsDaoTest {
    private ApplicationContext context;
    private GoodsDao dao;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        dao = (GoodsDao) context.getBean("goodsDao");
    }

    @Test
    public void findAll() {
        System.out.println("hello word");
        List<Goods> goods = dao.queryAll();
        for (Goods g : goods) {
            System.out.println(g);
        }
    }

    @Test
    public void findById() {
        Goods goods = dao.queryByGoodsId(1);
        System.out.println(goods);
    }

    @Test
    public void add() {
        Goods goods = new Goods();
        goods.setGoodsName("java");
        goods.setPrice(100.3);
        goods.setInventory(100);
        dao.save(goods);
    }

    @Test
    public void findOne() {

    }

}
