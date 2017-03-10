package com.simplecodeexamples.struts.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

import com.simplecodeexamples.struts.dto.UserObject;

public class UserDaoImpl {
	
	private Connection con;
	
	public UserDaoImpl() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://172.16.1.218:3306/messagegateway?" +
                    "user=root&password=");  
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}  
		
	}
	public UserObject selectUser(UserObject userObject) {
		UserObject  userObject2=null;
		try {
			PreparedStatement stmt=con.prepareStatement("select username,firstname,lastname from user where username=?");  
			stmt.setString(1,userObject.getUserName());  
			ResultSet resultSet=stmt.executeQuery();
			if(resultSet.next()){
				userObject2=new UserObject();
				userObject2.setUserName("username");
				userObject2.setFirstName(resultSet.getString("firstname"));
				userObject2.setLastName(resultSet.getString("lastname"));
			}
			con.close();  
		} catch (Exception e) {
			e.printStackTrace();
		}
		return userObject2;
	}
	public void insertUser(UserObject userObject) {
		try {
			
			PreparedStatement stmt=con.prepareStatement("INSERT INTO user (username, firstname, lastname, dob) VALUES (?,?,?,?)");  
			stmt.setString(1,userObject.getUserName());  
			stmt.setString(2,userObject.getFirstName());
			stmt.setString(3,userObject.getLastName());
			stmt.setTimestamp(4,new Timestamp(userObject.getDob().getTime()));
			  
			int i=stmt.executeUpdate();  
			System.out.println(i+" rows inserted");  
			  
			con.close();  
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
