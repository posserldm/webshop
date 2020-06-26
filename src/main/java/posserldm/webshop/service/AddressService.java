package posserldm.webshop.service;

import posserldm.webshop.model.Address;

import java.util.List;

public interface AddressService {

    /**
     * 添加一个地址
     * @param address
     */
    void add(Address address);

    /**
     * 通过用户名删除地址
     * @param username
     */
    void delete(String username);

    /**
     * 通过地址编号删除地址
     * @param address
     */
    void delete(Address address);

    /**
     * 更新地址
     * @param address
     */
    void update(Address address);

    /**
     * 通过用户名查看地址
     * @param username
     * @return
     */
    List<Address> visitByUsername(String username);

}
