package com.zadania.zadanie2.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/form")
public class MainForm extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
		if (request.getParameter("act") != null && request.getParameter("act").equals("reg")){
			out.println("<form action='' method='post'>" +
					"<input name='imie' type='text' />" +
					"" +
					"<br /><input name='sub' value='Wyślij' type='submit' />" +
					"</form>");
					
		}
		else {
			out.println("blah" +
					"" +
					"" +
					"");
		}
		out.println("</body></html>");
		out.close();
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}
	
}
