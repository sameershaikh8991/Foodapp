package com.dao;

import java.util.List;

import com.pojo.Food;

public interface FoodDao {
	boolean addFood(Food food);
	boolean updateFood(Food food);
	boolean deleteFood(int foodid);
	Food getFoodById(int foodid);

}
