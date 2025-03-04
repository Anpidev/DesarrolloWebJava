package com.pruebas;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servelt003 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	 
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			PrintWriter pWriter = response.getWriter();
			pWriter.print("<html>");
			pWriter.print("<body>");
			for (int i = 0; i <10;i++) {
				pWriter.print("<p>Hola desde un servlet</p>");
				pWriter.print("</body>");
				pWriter.print("</html>");
			}
		}

}
