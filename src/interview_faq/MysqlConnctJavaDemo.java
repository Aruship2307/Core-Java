package com.faq.imp.program;

//How do you connect to MySQL in Core Java?


import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class MysqlConnctJavaDemo {

	public static void main(String[] args) {
		try{  
			Class.forName("com.mysql.jdbc.Driver");  // argument is driver package name
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/blogapp","root","root1234");  //here blogapp is database name, root is username and root 1234 password 

			Statement stmt=con.createStatement();    // connection object create statement that can be used to execute queries 
			ResultSet rs=stmt.executeQuery("select * from post_table");  // executeQuery() method arugment as database query assigned to ResultSet object 
			/* ResultSet object allows you to retrieve & manipulate the data returned by an SQL query execution. ResultSet interface provides methods to iterate over the rows of the result set and retrieve the values of the columns for each row. */
			while(rs.next())  
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  // handled parent class exception
			}  
}
