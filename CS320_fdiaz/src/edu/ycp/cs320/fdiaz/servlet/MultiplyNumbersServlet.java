package edu.ycp.cs320.fdiaz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.ycp.cs320.fdiaz.controller.MultiplyNumbersController;
import edu.ycp.cs320.fdiaz.model.Numbers;

public class MultiplyNumbersServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		req.getRequestDispatcher("/_view/MultiplyNumbers.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		if(req.getParameter("return") != null){
			req.getRequestDispatcher("/_view/index.jsp").include(req, resp);
		}
		else{
			
			// Decode form parameters and dispatch to controller
			String errorMessage = null;
			Double result = null;
			try {
				Double first = getDoubleFromParameter(req.getParameter("first"));
				Double second = getDoubleFromParameter(req.getParameter("second"));
				Double third = getDoubleFromParameter(req.getParameter("third"));

				if (first == null || second == null || third == null) {
					errorMessage = "Please specify three numbers";
				} else {
					MultiplyNumbersController controller = new MultiplyNumbersController();
					Numbers model = new Numbers();
					controller.setModel(model, first, second, third);
					result = controller.multiply();
				}
			} catch (NumberFormatException e) {
				errorMessage = "Invalid double";
			}

			// Add parameters as request attributes
			req.setAttribute("first", req.getParameter("first"));
			req.setAttribute("second", req.getParameter("second"));
			req.setAttribute("third", req.getParameter("third"));

			// Add result objects as request attributes
			req.setAttribute("errorMessage", errorMessage);
			req.setAttribute("result", result);

			// Forward to view to render the result HTML document
			req.getRequestDispatcher("/_view/MultiplyNumbers.jsp").forward(req, resp);
		}
	}

	private Double getDoubleFromParameter(String s) {
		if (s == null || s.equals("")) {
			return null;
		} else {
			return Double.parseDouble(s);
		}
	}
}