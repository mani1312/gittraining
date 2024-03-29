                                        DeleteRecords :

package com.jdbc.createdb;

 
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class DeleteRec {
	   static final String DB_URL = "jdbc:mysql://localhost/ITEMS";
	   static final String USER = "root";
	   static final String PASS = "root";
	   static final String QUERY = "SELECT id, first, last, age FROM TOOLS";

	   public static void main(String[] args) {
	      
	      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
	         Statement stmt = conn.createStatement();
	      ) {		      
	         String sql = "DELETE FROM TOOLS " +
	            "WHERE id = 101";
	         stmt.executeUpdate(sql);
	         ResultSet rs = stmt.executeQuery(QUERY);
	         while(rs.next()){
	            
	            System.out.print("ID: " + rs.getInt("id"));
	            System.out.print(", Age: " + rs.getInt("age"));
	            System.out.print(", First: " + rs.getString("first"));
	            System.out.println(", Last: " + rs.getString("last"));
	         }
	         rs.close();
	      } catch (SQLException e) {
	         e.printStackTrace();
	      } 
	   }
	}

