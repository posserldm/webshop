package posserldm.webshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import posserldm.webshop.dao.OrderDao;
import posserldm.webshop.model.MyOrder;
import posserldm.webshop.service.OrderService;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public void add(MyOrder myOrder) {
        orderDao.save(myOrder);
    }

    @Override
    public void delete(MyOrder myOrder) {
        orderDao.delete(myOrder);
    }

    @Override
    public List<MyOrder> visitByUsername(String username) {
        return orderDao.queryByUsername(username);
    }

    @Override
    public MyOrder visitById(int id) {
        return orderDao.queryById(id);
    }

    @Override
    public List<MyOrder> visitAll() {
        return orderDao.queryAll();
    }
}
