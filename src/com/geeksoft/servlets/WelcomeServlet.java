package com.geeksoft.servlets;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServlet;

public class WelcomeServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String a = request.getParameter("Regular1");
		String b = request.getParameter("Premimum1");
		String c = request.getParameter("Super1");
		String d = request.getParameter("Desil1");

		String a1 = request.getParameter("Regular2");
		String b1 = request.getParameter("Premimum2");
		String c1 = request.getParameter("Super2");
		String d1 = request.getParameter("Desil2");

		String a2 = request.getParameter("Regular3");
		String b2 = request.getParameter("Premimum3");
		String c2 = request.getParameter("Super3");
		String d2 = request.getParameter("Desil3");

		String a3 = request.getParameter("Regular4");
		String b3 = request.getParameter("Premimum4");
		String c3 = request.getParameter("Super4");
		String d3 = request.getParameter("Desil4");

		String a4 = request.getParameter("Amx5");
		out.print("/n Thank you submited values for Independent : Regular1    Premimum1  Super1    Desil1  : " + a + " " + b + " " + c+ " " + d);
		out.print("/n Thank you submited values for Valero : Regular2    Premimum2  Super2    Desil2  : " + " " + a1 + " " + b1 + " " + c1 + " " + d1);
		out.print("/n Thank you submited values for Gas&Shop : Regular3    Premimum3  Super3    Desil3  : " + " " + a2 + " " + b2 + " " + c2 + " " + d2);
		out.print("/n Thank you submited values for  Mobil : Regular4    Premimum4  Super4    Desil4  : " + " " + a3 + " " + b3 + " " + c3 + " " + d3);
		out.print("/n Thank you submited values for AMX : " + a4);
	}

}
