package com.servlets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;

import com.model.FoodImpl;
import com.pojo.Food;

public class FoodCrud {
	public static void main(String[] args) throws NumberFormatException, IOException {
		FoodImpl crud = new FoodImpl();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			System.out.println("Operations on Food");
			System.out.println("1: update\n2: delete\n3: search all\n4: exit");
			ch = Integer.parseInt(br.readLine());
			switch (ch) {

			case 1:
				System.out.println("Enter food id  Number to update");
				int foodid = Integer.parseInt(br.readLine());
				Food updateFood = crud.getFoodById(foodid);
				System.out.println("what you want to update:");
				System.out.println("1:price\n2:name\n3:exit");
				ch = Integer.parseInt(br.readLine());
				switch (ch) {

				case 1:
					System.out.println("Enter new Price");
					double price = sc.nextInt(); 
					updateFood.setPrice(price);
					crud.updateFood(updateFood);
				case 2:
					System.out.println("Enter new Name");
					String name = br.readLine();
					updateFood.setName(name);
					crud.updateFood(updateFood);
					break;
				case 4:
					break;
				default:
					System.out.println("Wrong choice");
					break;
				}
				
				if(ch==1  )
				{
					
				}
				break;
//			
			}
		} while (ch != 4);

	}
}
