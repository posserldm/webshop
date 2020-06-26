package posserldm.webshop.controller;

import posserldm.webshop.model.User;

import javax.servlet.http.HttpSession;

public interface UserAction {

    /**
     * 用户登录
     * @return
     */
    String login(HttpSession session, User user);

    /**
     * 用户退出
     * @param session
     * @return
     */
    String logout(HttpSession session);

    /**
     * 用户注册
     * @return
     */
    String register();

    /**
     * 用户注销
     * @return
     */
    String destroyUser();

    /**
     * 更新用户信息
     * @return
     */
    String updateInformation();

    /**
     * 添加收货地址
     * @return
     */
    String addAddress();

    /**
     * 更新收货地址
     * @return
     */
    String updateAddress();

    /**
     * 删除收货地址
     * @return
     */
    String deleteAddress();

}
