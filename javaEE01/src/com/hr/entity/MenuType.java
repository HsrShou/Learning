package com.hr.entity;

/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
public class MenuType {
    private Integer TId;
    private String menuTypeName;
    private Integer menuStatus;

    @Override
    public String toString() {
        return "MenuType{" +
                "TId=" + TId +
                ", menuTypeName='" + menuTypeName + '\'' +
                ", menuStatus=" + menuStatus +
                '}';
    }

    public Integer getTId() {
        return TId;
    }

    public void setTId(Integer TId) {
        this.TId = TId;
    }

    public String getMenuTypeName() {
        return menuTypeName;
    }

    public void setMenuTypeName(String menuTypeName) {
        this.menuTypeName = menuTypeName;
    }

    public Integer getMenuStatus() {
        return menuStatus;
    }

    public void setMenuStatus(Integer menuStatus) {
        this.menuStatus = menuStatus;
    }
}
