package posserldm.webshop.service;

import posserldm.webshop.model.MyOrder;

import java.util.List;

public interface OrderService {

    /**
     * 添加订单
     * @param myOrder
     */
    void add(MyOrder myOrder);

    /**
     * 删除订单
     * @param order
     */
    void delete(MyOrder order);

    /**
     * 通过用户名查看订单
     * @param username
     * @return 返回一个订单的集合
     */
    List<MyOrder> visitByUsername(String username);

    /**
     * 通过订单编号查找订单
     * @param id
     * @return
     */
    MyOrder visitById(int id);

    /**
     * 查看所有的订单
     * @return 返回一个订单的集合
     */
    List<MyOrder> visitAll();

}
