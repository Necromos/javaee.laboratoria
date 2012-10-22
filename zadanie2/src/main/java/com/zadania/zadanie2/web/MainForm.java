package com.zadania.zadanie2.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * zajęcia 2 (3+3)
 * -pobieranie danych z formularza (zwłaszcza pola multiwyboru)
 * 		stworzyć dwie strony: 	1) wypełniamy formularz
 * 								2) odpowiedź po wypełnieniu
 * -zabawa z sesjami i application context
 * 		napisać zestaw stron demonstrujący działania pow.
 * 
 * 
 */
@WebServlet(urlPatterns="/form")
public class MainForm extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		out.println("Hello World!");
		out.close();
	}
	
}
