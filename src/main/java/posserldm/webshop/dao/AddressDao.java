package posserldm.webshop.dao;

import posserldm.webshop.model.Address;

import java.util.List;

public interface AddressDao {
    /**
     * 添加一个地址
     * @param address
     */
    void save(Address address);

    /**
     * 通过用户名删除地地址
     * @param username
     */
    void delete(String username);

    /**
     * 删除一个地址
     * @param address
     */
    void delete(Address address);

    /**
     * 更新地址信息
     * @param address
     */
    void update(Address address);

    /**
     * 通过地址编号查询地址
     * @param id
     * @return 用户地址对象
     */
    Address queryByAddressId(Integer id);

    /**
     * 通过用户名查询地址
     * @param username
     * @return 地址集合
     */
    List<Address> queryByUsername(String username);

    /**
     * 查询所有的地址
     * @return 地址集合
     */
    List<Address> queryAll();
}
