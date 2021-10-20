                                        PageRedirect:
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
public class PageRedirect extends HttpServlet {
  

	private static final long serialVersionUID = 1L;

protected void doGet(HttpServletRequest request, HttpServletResponse response)
          throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try { 
            response.sendRedirect("https://dotnettutorials.net/course/java-servlets-tutorials/F");
        }
        finally {            
            out.close();
        }
    }
}

                                          HTML File:
<!DOCTYPE html>

<html>  
<head>  
<meta charset="ISO-8859-1">  
<title>sendRedirect example</title>  
</head>  
<body>    
<form action="MyServlet">  
<input type="text" name="name">  
<input type="submit" value="Google Search">  
</form>    
</body>  
</html>

                                      MyServlet:
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;  
  
public class MyServlet extends HttpServlet {  
    
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)  
            throws ServletException, IOException {  
  
        String name=request.getParameter("name");  
        response.sendRedirect("https://www.google.co.in/#q="+name);  
    }  
}  									  