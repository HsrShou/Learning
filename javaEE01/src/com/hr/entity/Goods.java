package com.hr.entity;

import java.math.BigDecimal;
/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
public class Goods {
    private Integer goodsId;
    private String goodsName;
    private Integer gtId;
    private BigDecimal unitPrice;
    private Integer stock;
    private String imgUrl;
    private String introduce;
    private String typeName;

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

    public Integer getGtId() {
        return gtId;
    }

    public void setGtId(Integer gtId) {
        this.gtId = gtId;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "goodsId=" + goodsId +
                ", goodsName='" + goodsName + '\'' +
                ", gtId=" + gtId +
                ", unitPrice=" + unitPrice +
                ", stock=" + stock +
                ", imgUrl='" + imgUrl + '\'' +
                ", introduce='" + introduce + '\'' +
                ", typeName='" + typeName + '\'' +
                '}';
    }
}
