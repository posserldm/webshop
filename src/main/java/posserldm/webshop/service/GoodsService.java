package posserldm.webshop.service;

import posserldm.webshop.model.Goods;

import java.util.List;

public interface GoodsService {

    /**
     * 添加一个商品
     * @param goods
     */
    void addGoods(Goods goods);

    /**
     * 下架一个商品
     * @param goods
     */
    void remove(Goods goods);

    /**
     * 更新商品信息
     * @param goods
     */
    void update(Goods goods);

    /**
     * 通过商品的名字来查看商品
     * @param name
     * @return 一个商品对象集合
     */
    List<Goods> visitByName(String name);

    /**
     * @param id
     * @return 一个商品对象
     */
    Goods visitById(int id);
}
