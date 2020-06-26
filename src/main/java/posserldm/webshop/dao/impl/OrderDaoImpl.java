package posserldm.webshop.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import posserldm.webshop.dao.OrderDao;
import posserldm.webshop.model.MyOrder;

import java.util.List;

@Repository
public class OrderDaoImpl implements OrderDao {

    @Autowired
    private HibernateTemplate HTemplate;

    @Override
    public void save(MyOrder myOrder) {
        HTemplate.save(myOrder);
    }

    @Override
    public void delete(MyOrder myOrder) {
        HTemplate.delete(myOrder);
    }

    @Override
    public void delete(String username) {
        HTemplate.deleteAll(queryByUsername(username));
    }

    @Override
    public MyOrder queryById(int id) {
        return HTemplate.get(MyOrder.class, id);
    }

    @Override
    public List<MyOrder> queryByUsername(String username) {
        return (List<MyOrder>) HTemplate.find("from MyOrder where username = ?0", username);
    }

    @Override
    public List<MyOrder> queryAll() {
        return (List<MyOrder>) HTemplate.find("from MyOrder");
    }
}
