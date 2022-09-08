package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.FoodImpl;
import com.model.UserImpl;
import com.pojo.Food;
import com.pojo.User;

/**
 * Servlet implementation class FoodServlet
 */
@WebServlet("/FoodServlet")
public class FoodServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FoodServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String FoodAction = request.getParameter("act");
		FoodImpl impl = new FoodImpl();
		if (FoodAction.equalsIgnoreCase("foodAddAction")) {
			System.out.println("enter in loop..");
			String name = request.getParameter("name");
			int foodid  =Integer.parseInt(request.getParameter("foodid"));
			int foodprice  =Integer.parseInt(request.getParameter("price"));

			Food food = new Food();
			food.setName(name);
			food.setFoodid(foodid);
			food.setPrice(foodprice);

			boolean b = impl.addFood(food);
			if (b)
				System.out.println("Food add successfully...");
			else
				System.out.println("something want wronge....");
		} 
	}

}
