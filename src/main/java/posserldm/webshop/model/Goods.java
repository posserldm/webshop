package posserldm.webshop.model;

import java.util.Objects;

public class Goods {
    private Integer goodsId;
    private String goodsName;
    private String author;
    private Double price;
    private Integer inventory;
    private String image;

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Goods goods = (Goods) o;

        if (!Objects.equals(goodsId, goods.goodsId)) return false;
        if (!Objects.equals(goodsName, goods.goodsName)) return false;
        if (!Objects.equals(author, goods.author)) return false;
        if (!Objects.equals(price, goods.price)) return false;
        if (!Objects.equals(inventory, goods.inventory)) return false;
        if (!Objects.equals(image, goods.image)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = goodsId != null ? goodsId.hashCode() : 0;
        result = 31 * result + (goodsName != null ? goodsName.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (inventory != null ? inventory.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", inventory=" + inventory +
                ", image='" + image + '\'' +
                '}';
    }
}
