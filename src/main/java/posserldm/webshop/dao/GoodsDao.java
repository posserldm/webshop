package posserldm.webshop.dao;

import posserldm.webshop.model.Goods;

import java.util.List;

public interface GoodsDao {

    /**
     * 添加一个商品
     * @param goods
     */
    void save(Goods goods);

    /**
     * 删除一个商品
     * @param goods
     */
    void delete(Goods goods);

    /**
     * 更新商品信息
     * @param goods
     */
    void update(Goods goods);

    /**
     * 通过商品编号查找商品
     * @param goodsId
     * @return 商品对象
     */
    Goods queryByGoodsId(int goodsId);

    /**
     * @param goodsName
     * @return 同名商品列表
     */
    List<Goods> queryByGoodsName(String goodsName);

    /**
     * 查询所有商品
     * @return
     */
    List<Goods> queryAll();
}
