//package com.servlets;
//
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//
//import com.model.UserImpl;
//
//public class UserCrud {
//	public static void main(String[] args) {
//		UserImpl crud = new UserImpl();
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int ch = 0;
//		do {
//			System.out.println("Update user Profile:\n");
//			System.out.println("what you want to update::");
//			System.out.println(
//					"1:name \n2: contact\n3: email \n4: address\n5: exit");
//			ch = Integer.parseInt(br.readLine());
//			switch (ch) {
//			case 1:
////				System.out.println("");
////				System.out.println("Enter Account Number to update account type");
////				accNo = Integer.parseInt(br.readLine());
////				Account updateAcc = crud.getAccountByAccountNO(accNo);
////				System.out.println("Enter new account type");
////				accType = br.readLine();
////				updateAcc.setAccountType(accType);
////				b = crud.updateAccount(updateAcc);
////				if (b)
////					System.out.println(" updated........");
////				else
////					System.out.println("Failed............");
//				break;
//			
//		}
//		while(ch!=5);
//
//	}
//	}
