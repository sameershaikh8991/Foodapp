package com.pojo;

import java.util.List;

public class User {
		private String name;
		private String emailId;
		private String username;
		private String password;
		private long contactno;
		private String address;
		
		public User() {
			super();
		}
		public User(String name, String emailId, String username, String password, int contactno, String address) {
			super();
			this.name = name;
			this.emailId = emailId;
			this.username = username;
			this.password = password;
			this.contactno = contactno;
			this.address = address;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public long getContactno() {
			return contactno;
		}
		public void setContactno(long contact) {
			this.contactno = contact;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "User [name=" + name + ", emailId=" + emailId + ", username=" + username + ", password=" + password
					+ ", contactno=" + contactno + ", address=" + address + "]";
		}
		
		
		
		
		
		

}