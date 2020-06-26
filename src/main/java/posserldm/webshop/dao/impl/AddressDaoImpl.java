package posserldm.webshop.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import posserldm.webshop.dao.AddressDao;
import posserldm.webshop.model.Address;

import java.util.List;

@Repository
public class AddressDaoImpl implements AddressDao {

    @Autowired
    private HibernateTemplate HTemplate;

    @Override
    public void save(Address address) {
        HTemplate.save(address);
    }

    @Override
    public void delete(String username) {
        HTemplate.deleteAll(queryByUsername(username));
    }

    @Override
    public void delete(Address address) {
        HTemplate.delete(address);
    }

    @Override
    public void update(Address address) {
        HTemplate.update(address);
    }

    @Override
    public Address queryByAddressId(Integer id) {
        return HTemplate.get(Address.class, id);
    }

    @Override
    public List<Address> queryByUsername(String username) {
        return (List<Address>) HTemplate.find("from Address where username = ?0", username);
    }

    @Override
    public List<Address> queryAll() {
        return (List<Address>) HTemplate.find("from Address");
    }
}
