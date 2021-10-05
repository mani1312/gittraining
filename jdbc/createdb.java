    JDBC create database :
	
package com.jdbc.createdb;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateDB {

static final String DB_URL ="jdbc:mysql://localhost:3306/";
static final String USER ="root";
static final String PASS ="root";

public static void main(String[] args) {
	try (Connection connect = DriverManager.getConnection(DB_URL,USER,PASS);
			Statement stmt =connect.createStatement();
			) {
String mysql = "CREATE DATABASE ITEMS";
stmt.executeUpdate(mysql);
System.out.println("create  database sucessfully");
	
}
catch(SQLException k)
	{
k.printStackTrace();
	}
}
}