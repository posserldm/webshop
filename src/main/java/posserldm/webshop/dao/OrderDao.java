package posserldm.webshop.dao;

import posserldm.webshop.model.MyOrder;

import java.util.List;

public interface OrderDao {

    /**
     * 添加一个订单
     * @param myOrder
     */
    void save(MyOrder myOrder);

    /**
     * 删除一个订单
     * @param id
     */
    void delete(MyOrder id);

    /**
     * 通过用户名删除订单
     * @param username
     */
    void delete(String username);

    /**
     * 通过订单编号查找订单
     * @param id
     * @return 订单对象
     */
    MyOrder queryById(int id);

    /**
     * 通过用户名查找订单
     * @param username
     * @return 订单对象的集合
     */
    List<MyOrder> queryByUsername(String username);

    /**
     * 查询所有的订单信息
     * @return 订单对象的集合
     */
    List<MyOrder> queryAll();
}
