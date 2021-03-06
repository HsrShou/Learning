package com.hr.entity;
/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
public class GoodsType {
        private Integer typeId;
        private String typeName;
        private String introduce;

    @Override
    public String toString() {
        return "GoodsType{" +
                "typeId=" + typeId +
                ", typeName='" + typeName + '\'' +
                ", introduce='" + introduce + '\'' +
                '}';
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
