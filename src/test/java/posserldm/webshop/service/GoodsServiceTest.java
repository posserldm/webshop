package posserldm.webshop.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import posserldm.webshop.model.Goods;

import java.util.List;

public class GoodsServiceTest {
    private ApplicationContext context;
    private GoodsService service;

    @Before
    public void init() {
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        service = context.getBean(GoodsService.class);
    }

    @Test
    public void add() {
        Goods goods = new Goods();
        goods.setGoodsName("java");
        goods.setPrice(30.5);
        goods.setInventory(100);
        service.addGoods(goods);
    }
    @Test
    public void findOne() {
        Goods goods = service.visitById(1);
        System.out.println(goods);
    }
    @Test
    public void findName() {
        List<Goods> goods = service.visitByName("java");
        System.out.println(goods);
    }
    @Test
    public void update() {
        Goods goods = service.visitById(3);
        goods.setAuthor("ldm");
        service.update(goods);
    }
    @Test
    public void remove() {
        Goods goods = context.getBean(Goods.class);
        goods.setGoodsId(2);
        service.remove(goods);
    }
}
