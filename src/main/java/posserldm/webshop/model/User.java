package posserldm.webshop.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Collection;
import java.util.Objects;

public class User {
    @NotNull(message = "用户名不能为空！")
    private String username;
    @Size(min = 6,max = 20, message = "密码长度在6~20位之间！")
    private String password;
    @Pattern(regexp = "1[358]\\d{9}", message = "请输入正确的11位数字手机号码！")
    private String phoneNumber;
    private String email;
    private String headImage;
    private Collection<Address> addressesByUsername;
    private Collection<MyOrder> ordersByUsername;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHeadImage() {
        return headImage;
    }

    public void setHeadImage(String headImage) {
        this.headImage = headImage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        if (!Objects.equals(username, user.username)) return false;
        if (!Objects.equals(password, user.password)) return false;
        if (!Objects.equals(phoneNumber, user.phoneNumber)) return false;
        if (!Objects.equals(email, user.email)) return false;
        if (!Objects.equals(headImage, user.headImage)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = username != null ? username.hashCode() : 0;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (headImage != null ? headImage.hashCode() : 0);
        return result;
    }

    public Collection<Address> getAddressesByUsername() {
        return addressesByUsername;
    }

    public void setAddressesByUsername(Collection<Address> addressesByUsername) {
        this.addressesByUsername = addressesByUsername;
    }

    public Collection<MyOrder> getOrdersByUsername() {
        return ordersByUsername;
    }

    public void setOrdersByUsername(Collection<MyOrder> ordersByUsername) {
        this.ordersByUsername = ordersByUsername;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", headImage='" + headImage + '\'' +
                '}';
    }
}
