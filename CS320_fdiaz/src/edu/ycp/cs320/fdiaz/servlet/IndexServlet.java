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
				resp.sendRedirect(req.getContextPath() + "/guessingGame");
			} else if (req.getParameter("add") != null) {
				resp.sendRedirect(req.getContextPath() + "/addNumbers");
			} else if (req.getParameter("mult") != null) {
				resp.sendRedirect(req.getContextPath() + "/MultiplyNumbers");
			} else {
				throw new ServletException("Unknown command");
			}
	}
}
