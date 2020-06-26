package posserldm.webshop.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import posserldm.webshop.dao.GoodsDao;
import posserldm.webshop.model.Goods;

import java.util.List;

@Repository
public class GoodsDaoImpl implements GoodsDao {

    @Autowired
    private HibernateTemplate HTemplate;

    @Override
    public void save(Goods goods) {
        HTemplate.save(goods);
    }

    @Override
    public void delete(Goods goods) {
        HTemplate.delete(goods);
    }

    @Override
    public void update(Goods goods) {
        HTemplate.update(goods);
    }

    @Override
    public Goods queryByGoodsId(int goodsId) {
        return HTemplate.get(Goods.class, goodsId);
    }

    @Override
    public List<Goods> queryByGoodsName(String goodsName) {
        return (List<Goods>) HTemplate.find("from Goods where goodsName = ?0", goodsName);
    }

    @Override
    public List<Goods> queryAll() {
        return (List<Goods>) HTemplate.find("from Goods");
    }
}
