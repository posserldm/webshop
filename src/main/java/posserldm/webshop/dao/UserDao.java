package posserldm.webshop.dao;

import posserldm.webshop.model.User;

import java.util.List;

public interface UserDao {

    /**
     * 添加一个用户
     * @param user
     */
    void save(User user);

    /**
     * 通过用户名删除用户
     * @param user
     */
    void delete(User user);

    /**
     * 更新用户信息
     * @param user
     */
    void update(User user);

    /**
     * 通过用户名查询用户
     * @param username
     * @return 一个用户对象
     */
    User queryByUsername(String username);

    /**
     * 查询所有的用户信息
     * @return 用户对象集合
     */
    List<User> queryAll();
}
