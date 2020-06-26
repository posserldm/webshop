package posserldm.webshop.controller;

import posserldm.webshop.model.MyOrder;

import javax.servlet.http.HttpSession;

public interface OrderAction {

    /**
     * 删除订单
     * @return
     */
    String deleteOrder(HttpSession session, MyOrder order);

    /**
     * 浏览订单
     * @return
     */
    String visitOrder();

    /**
     * 创建订单
     * @return
     */
    String createOrder();
}
