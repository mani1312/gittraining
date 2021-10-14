      jspfiles:

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="Register" method="post">
<table>
<tr>
<td>User Name</td>
<td><input> type="text" name="uname"></td>
</tr>
<tr>
<td>Password</td>
<td><input> type="password" name="password"></td>
</tr>
<tr>
<td>Email</td>
<td><input> type="text" name="email"></td>
</tr>
<tr>
<td>Phone</td>
<td><input> type="text" name="phone"></td>
</tr>
</table>
</form>
</body>
</html>

                          javafile:
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



/**
* Servlet implementation class Register
*/
public class Register extends HttpServlet {
private static final long serialVersionUID = 1L;



/**
* Default constructor.
*/
public Register() {
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
protected void doPost(jakarta.servlet.http.HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
// TODO Auto-generated method stub
String uname=request.getParameter("uname");
String password=request.getParameter("password");
String email=request.getParameter("email");
String phone=request.getParameter("phone");
Member member = new Member(uname, password, email, phone);
RegisterDao rDao=new RegisterDao();
String result=rDao.insert(member);
response.getWriter().print(result);

}
}

        DAO:
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class RegisterDao {
private String dburl="jdbc:mysql://localhost:3306/userdb";
private String dbuname="root";
private String dbpassword="root";
private String dbdriver="com.mysql.jdbc.Driver";
public void loadDriver(String dbDriver)
{
try {
Class.forName(dbDriver);
}catch(ClassNotFoundException e) {
e.printStackTrace();
}
}


public Connection getConnection()
{
Connection con=null;
try {

DriverManager.getConnection(dburl, dbuname, dbpassword);
}catch (SQLException e) {
e.printStackTrace();
}
return con;
}

public String insert(Member member)
{
loadDriver(dbdriver);
Connection con=getConnection();
String result="data entered successfully";
String sql="insert into member value(?,?,?,?)";

try {
PreparedStatement ps=con.prepareStatement(sql);
ps.setString(1, member.getUname());
ps.setString(2, member.getPassword());
ps.setString(3, member.getEmail());
ps.setString(4, member.getPhone());
ps.executeUpdate();

}catch(SQLException e) {
e.printStackTrace();
result="data not entered";
}
return result;
}
}		
          Getter  and setter:
		  public class Member
{
private String uname, password, email, phone;

public Member() {
super();
}



public Member(String uname, String password, String email, String phone) {
super();
this.uname = uname;
this.password = password;
this.email = email;
this.phone = phone;
}



public String getUname() {
return uname;
}



public void setUname(String uname) {
this.uname = uname;
}



public String getPassword() {
return password;
}



public void setPassword(String password) {
this.password = password;
}



public String getEmail() {
return email;
}



public void setEmail(String email) {
this.email = email;
}



public String getPhone() {
return phone;
}



public void setPhone(String phone) {
this.phone = phone;
}
}


    