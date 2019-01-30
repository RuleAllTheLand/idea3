package bean;

import java.io.Serializable;

/**
 * 代表一件衣服
 */
public class Clothes implements Serializable {
    private String id;//商品编号
    private String brand;//品牌
    private String stytle;//款式
    private String corlor;//颜色
    private String size;//尺寸
    private  int num;//库存数量
    private float price;//单价
    private String description;//描述

    public Clothes(String id, String brand, String stytle, String corlor, String size, int num, float price, String description) {
        this.id = id;
        this.brand = brand;
        this.stytle = stytle;
        this.corlor = corlor;
        this.size = size;
        this.num = num;
        this.price = price;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getStytle() {
        return stytle;
    }

    public void setStytle(String stytle) {
        this.stytle = stytle;
    }

    public String getCorlor() {
        return corlor;
    }

    public void setCorlor(String corlor) {
        this.corlor = corlor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
