                      how to upload a file in servlet?
package net.codejava.servlet;

import java.io.File;
import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/UploadServlet")
@MultipartConfig(fileSizeThreshold=1024*1024*2,	// 2MB
				 maxFileSize=1024*1024*10,		// 10MB
				 maxRequestSize=1024*1024*50)	// 50MB
public class UploadServlet extends HttpServlet {

	
	private static final String SAVE_DIR = "uploadFiles";

	
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String appPath = request.getServletContext().getRealPath("");
		
		String savePath = appPath + File.separator + SAVE_DIR;

		
		File fileSaveDir = new File(savePath);
		if (!fileSaveDir.exists()) {
			fileSaveDir.mkdir();
		}

		for (Part part : request.getParts()) {
			String fileName = extractFileName(part);
			
			fileName = new File(fileName).getName();
			part.write(savePath + File.separator + fileName);
		}

		request.setAttribute("message", "Upload has been done successfully!");
		getServletContext().getRequestDispatcher("/message.jsp").forward(
				request, response);
	}

	
	private String extractFileName(Part part) {
		String contentDisp = part.getHeader("content-disposition");
		String[] items = contentDisp.split(";");
		for (String s : items) {
			if (s.trim().startsWith("filename")) {
				return s.substring(s.indexOf("=") + 2, s.length()-1);
			}
		}
		return "";
	}
}


          upload.jsp  file
		  <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>File Upload</title>
</head>
<body>
<center>
	<h1>File Upload</h1>
	<form method="post" action="UploadServlet"
		enctype="multipart/form-data">
		Select file to upload: <input type="file" name="file" size="60" /><br />
		<br /> <input type="submit" value="Upload" />
	</form>
</center>
</body>
</html>

                             Message.jsp file:
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload</title>
</head>
<body>
	<h2>${requestScope.message}</h2>
</body>
</html>							 