package com.zadania.zadanie2.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zadania.zadanie2.domain.Counter;
import com.zadania.zadanie2.domain.Log;



@WebServlet(urlPatterns="/logged")
public class Logged extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		Log logged = (Log) session.getAttribute("log");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
		if (request.getParameter("nick").equals("jan") && request.getParameter("pssw").equals("qwer")){
			Counter gCount = (Counter) request.getServletContext().getAttribute("globalLogged");
			if (logged.isLog() == false){
				gCount.incCounter();
				logged.setLog(true);
			}
			out.println("<h3> Witaj " + request.getParameter("nick") + "!</h3><br />" +
					"Jesteś " + gCount.getCounter() + " użytkownikiem online<br />" +
					"<a href='?act=wyl'>Wyloguj</a>");
		}
		else {
			out.println("Błąd<br /><a href='/'>Powrót</a>");
		}
		out.println("</body></html>");
		out.close();
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		HttpSession session = request.getSession();
		Log logged = (Log) session.getAttribute("log");
		
		PrintWriter out = response.getWriter();
		out.println("<html><head></head><body>");
		
		if (request.getParameter("act") != null && request.getParameter("act").equals("wyl")){
			Counter gCount = (Counter) request.getServletContext().getAttribute("globalLogged");
			if (logged.isLog() == true){
				gCount.decCounter();
				logged.setLog(false);
			}
			out.println("<h3>Polecamy się na przyszłość!</h3>" +
					"<br /><a href='zadanie2'>Wróć do głównej strony</a>");
		}
		else {
			out.println("<h1>Wystąpił błąd, <a href='zadanie2'>wróć</a> do głównej strony");
		}
		
		out.println("</body></html>");
		out.close();
	}
	
	
	
}
