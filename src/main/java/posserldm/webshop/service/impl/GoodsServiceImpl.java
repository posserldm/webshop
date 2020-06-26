package posserldm.webshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import posserldm.webshop.dao.GoodsDao;
import posserldm.webshop.model.Goods;
import posserldm.webshop.service.GoodsService;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    @Override
    public void addGoods(Goods goods) {
        goodsDao.save(goods);
    }

    @Override
    public void remove(Goods goods) {
        goodsDao.delete(goods);
    }

    @Override
    public List<Goods> visitByName(String name) {
        return goodsDao.queryByGoodsName(name);
    }

    @Override
    public Goods visitById(int id) {
        return goodsDao.queryByGoodsId(id);
    }

    @Override
    public void update(Goods goods) {
        goodsDao.update(goods);
    }
}
