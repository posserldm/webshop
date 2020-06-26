package posserldm.webshop.model;

import java.util.Objects;

public class Address {
    private Integer addressId;
    private String username;
    private String address;
    private User user;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address1 = (Address) o;

        if (!Objects.equals(addressId, address1.addressId)) return false;
        if (!Objects.equals(username, address1.username)) return false;
        if (!Objects.equals(address, address1.address)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = addressId != null ? addressId.hashCode() : 0;
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        return result;
    }


    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
