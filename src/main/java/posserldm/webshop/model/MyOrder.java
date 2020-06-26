package posserldm.webshop.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Objects;

public class MyOrder {
    private Integer orderId;
    private String username;
    private String phoneNumber;
    private String address;
    private Byte state;
    private String goodsName;
    private Double goodPrice;
    private Short goodsNumber;
    private Double cost;
    private String image;
    private Timestamp times;
    private User user;

    public MyOrder() {
        times = new Timestamp(new Date().getTime());
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public Short getGoodsNumber() {
        return goodsNumber;
    }

    public void setGoodsNumber(Short goodsNumber) {
        this.goodsNumber = goodsNumber;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Timestamp getTimes() {
        return times;
    }

    public void setTimes(Timestamp times) {
        this.times = times;
    }

    public Double getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(Double goodPrice) {
        this.goodPrice = goodPrice;
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
        MyOrder myOrder = (MyOrder) o;
        return Objects.equals(orderId, myOrder.orderId) &&
                Objects.equals(username, myOrder.username) &&
                Objects.equals(phoneNumber, myOrder.phoneNumber) &&
                Objects.equals(address, myOrder.address) &&
                Objects.equals(state, myOrder.state) &&
                Objects.equals(goodsName, myOrder.goodsName) &&
                Objects.equals(goodPrice, myOrder.goodPrice) &&
                Objects.equals(goodsNumber, myOrder.goodsNumber) &&
                Objects.equals(cost, myOrder.cost) &&
                Objects.equals(image, myOrder.image) &&
                Objects.equals(times, myOrder.times);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, username, phoneNumber, address, state, goodsName, goodPrice, goodsNumber, cost, image, times);
    }

    @Override
    public String toString() {
        return "MyOrder{" +
                "orderId=" + orderId +
                ", username='" + username + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", state=" + state +
                ", goodsName='" + goodsName + '\'' +
                ", goodPrice=" + goodPrice +
                ", goodsNumber=" + goodsNumber +
                ", cost=" + cost +
                ", image='" + image + '\'' +
                ", times=" + times +
                '}';
    }
}
