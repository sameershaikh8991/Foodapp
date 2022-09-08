package com.pojo;

public class Food {
	private String name;
	private int foodid;
	private double price;
	
	
	public Food() {
		super();
	}
	public Food(String name, int foodid, double price) {
		super();
		this.name = name;
		this.foodid = foodid;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", foodid=" + foodid + ", price=" + price + "]";
	}
	
	
	
	

}
