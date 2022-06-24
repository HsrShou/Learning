package com.hr.entity;

import java.math.BigDecimal;
/**
 * @author Han ShouRong
 * @date 2022/6/25 上午 7:15
 */
public class Menu {
	private Integer id;//开发时，不用int 而是用Integer.int id;
	private String menuName;
	private String urlImage;
	private BigDecimal price;
	private Integer menuStatus;
	private Integer menuTypeId;
	public Menu(Integer id, String menuName, String urlImage, BigDecimal price, Integer menuStatus,
			Integer menuTypeId) {
		super();
		this.id = id;
		this.menuName = menuName;
		this.urlImage = urlImage;
		this.price = price;
		this.menuStatus = menuStatus;
		this.menuTypeId = menuTypeId;
	}
	public Menu() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getMenuStatus() {
		return menuStatus;
	}
	public void setMenuStatus(Integer menuStatus) {
		this.menuStatus = menuStatus;
	}
	public Integer getMenuTypeId() {
		return menuTypeId;
	}
	public void setMenuTypeId(Integer menuTypeId) {
		this.menuTypeId = menuTypeId;
	}
	@Override
	public String toString() {
		return "Menu [id=" + id + ", menuName=" + menuName + ", urlImage=" + urlImage + ", price=" + price
				+ ", menuStatus=" + menuStatus + ", menuTypeId=" + menuTypeId + "]";
	}
	
}
