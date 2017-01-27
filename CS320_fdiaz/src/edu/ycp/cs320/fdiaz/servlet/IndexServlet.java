package edu.ycp.cs320.fdiaz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		req.getRequestDispatcher("/_view/index.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
			if (req.getParameter("gg") != null) {
				req.getRequestDispatcher("/_view/guessingGame.jsp").include(req, resp);
			} else if (req.getParameter("add") != null) {
				req.getRequestDispatcher("/_view/addNumbers.jsp").include(req, resp);
			} else if (req.getParameter("mult") != null) {
				req.getRequestDispatcher("/_view/MultiplyNumbers.jsp").include(req, resp);
			} else {
				throw new ServletException("Unknown command");
			}
	}
}
