package posserldm.webshop.service;

import posserldm.webshop.model.User;

import java.util.List;

public interface UserService {

    /**
     * 注册用户
     * @param user
     */
    void register(User user);

    /**
     * 修改密码
     * @param user
     */
    void resetPassword(User user);

    /**
     * 通过用户名删除用户
     * @param user
     */
    void delete(User user);

    /**
     * 用户登录
     * @param user
     * @return
     */
    Boolean login(User user);

    /**
     * 展示所有的用户信息
     * @return
     */
    List<User> showAllUsers();
}
