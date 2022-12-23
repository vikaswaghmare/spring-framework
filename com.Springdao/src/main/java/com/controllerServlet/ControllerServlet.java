package com.controllerServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.factory.StudentServiceFactory;
import com.model.StudentTo;
import com.service.StudentService;

public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String button_Label = request.getParameter("button");
		String status = "";
		RequestDispatcher rd = null;
		if (button_Label.equals("ADD")) {
			StudentService service = StudentServiceFactory.getStudentService();
			StudentTo sto = new StudentTo();
			sto.setSid(request.getParameter("sid"));
			sto.setSname(request.getParameter("sname"));
			sto.setSaddr(request.getParameter("saddr"));
			status = service.addStudent(sto);
			if (status.equals("success")) {
				rd = request.getRequestDispatcher("./success.html");
				rd.forward(request, response);
			}
			if (status.equals("failure")) {
				rd = request.getRequestDispatcher("./failure.html");
				rd.forward(request, response);
			}
			if (status.equals("existed")) {

				rd = request.getRequestDispatcher("./existed.html");
				rd.forward(request, response);
			}
		}
		if (button_Label.equals("SEARCH")) {
			String sid = request.getParameter("sid");
			StudentService service = StudentServiceFactory.getStudentService();
			StudentTo sto = service.searchStudent(sid);
			RequestDispatcher dispatcher = null;
			if (sto == null) {
				dispatcher = request.getRequestDispatcher("notexisted.html");
				dispatcher.forward(request, response);
			} else {
				request.setAttribute("sto", sto);
				dispatcher = request.getRequestDispatcher("display.jsp");
				dispatcher.forward(request, response);
			}
		}
		if (button_Label.equals("DELETE")) {
			String sid = request.getParameter("sid");
			StudentService service = StudentServiceFactory.getStudentService();
			status = service.deleteStudent(sid);
			RequestDispatcher dispatcher = null;
			if (status.equals("success")) {
				dispatcher = request.getRequestDispatcher("success.html");
				dispatcher.forward(request, response);
			}
			if (status.equals("failure")) {
				dispatcher = request.getRequestDispatcher("failure.html");
				dispatcher.forward(request, response);
			}
			if (status.equals("notexisted")) {
				dispatcher = request.getRequestDispatcher("notexisted.html");
				dispatcher.forward(request, response);
			}
		}
	}
}
