package com.caoweiwei.senior2.week2.bean;
/** 
* @author 作者:曹伟伟
* @version 创建时间：2019年10月14日 上午8:55:30
* 类功能说明 
*/

import java.math.BigDecimal;
//实体类
public class Goods {
	//属性
	private int gid;
	private String gname;
	private BigDecimal price;
	private String baifenbi;
	//封装
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getBaifenbi() {
		return baifenbi;
	}
	public void setBaifenbi(String baifenbi) {
		this.baifenbi = baifenbi;
	}
	@Override
	public String toString() {
		return "Goods [gid=" + gid + ", gname=" + gname + ", price=" + price + ", baifenbi=" + baifenbi + "]";
	}
	public Goods(int gid, String gname, BigDecimal price, String baifenbi) {
		super();
		this.gid = gid;
		this.gname = gname;
		this.price = price;
		this.baifenbi = baifenbi;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
