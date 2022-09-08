package com.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.RestoreAction;

import com.dao.FoodDao;
import com.db.MyConnection;
import com.pojo.Food;

public class FoodImpl implements FoodDao {
	@Override
	public boolean addFood(Food food) {
		boolean state= false;
		try(Connection conn = MyConnection.connect()) {
			
		String sql = "insert into  biryani values (?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setString(1,food.getName());
		pstmt.setInt(2, food.getFoodid());
		pstmt.setInt(3, (int) food.getPrice());

		int no = pstmt.executeUpdate();
		System.out.println(no);
		if(no>0) {
			state = true;
		}
		
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return state;
	}
	@Override
	public Food getFoodById(int foodid) {
		Food f = null;
		String sql = "select * from  biryani where id=?";
		try (Connection connection = MyConnection.connect()) {
			PreparedStatement pstatement = connection.prepareStatement(sql);
			pstatement.setInt(1, foodid);
//				System.out.println(pstatement);
			ResultSet rset = pstatement.executeQuery();
			while (rset.next()) {
				String name = rset.getString("name");
				int fid = rset.getInt("id");
				int fprice = rset.getInt("price");
//					(int accNo, int customerId, double balance, String accountType
				f = new Food(name, fid, fprice);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return f;
	}
	
	public boolean updateFood(Food food) {
		boolean b = false;
		String sql = "update biryani set price=? name=? where id=?";
		try (Connection connection = MyConnection.connect()) {
			PreparedStatement pstatement = connection.prepareStatement(sql);
			pstatement.setDouble(1,food.getPrice());
			pstatement.setString(2, food.getName());
			pstatement.setInt(3, food.getFoodid());
			
			int no = pstatement.executeUpdate();
			System.out.println("Number of rows affected: " + no);
			if (no > 0)
				b = true;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return b;
		}
	

	public boolean deleteFood(int foodid) {
		return false;}
}

