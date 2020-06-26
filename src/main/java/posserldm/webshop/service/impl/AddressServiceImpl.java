package posserldm.webshop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import posserldm.webshop.dao.AddressDao;
import posserldm.webshop.model.Address;
import posserldm.webshop.service.AddressService;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDao addressDao;

    @Override
    public void add(Address address) {
        addressDao.save(address);
    }

    @Override
    public void delete(String username) {
        addressDao.delete(username);
    }

    @Override
    public void delete(Address address) {
        addressDao.delete(address);
    }

    @Override
    public void update(Address address) {
        addressDao.update(address);
    }

    @Override
    public List<Address> visitByUsername(String username) {
        return addressDao.queryByUsername(username);
    }
}
