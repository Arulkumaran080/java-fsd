package com.operations;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.domain.ClassDetails;
import com.Util.Util;

@WebServlet("/deleteclass")
public class DeleteClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		request.getRequestDispatcher("deleteClass.html").include(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int name = Integer.parseInt(request.getParameter("Name"));
		
		
		try {
			SessionFactory factory = Util.buildConnection();
			
			Session session = factory.openSession();
			ClassDetails o =session.load(ClassDetails.class, new Integer(name));
			ClassDetails s =(ClassDetails)o;
			Transaction tx = session.beginTransaction();
			
			session.delete(s);
			
			tx.commit();
			
			if(session != null) {
				out.println("<div align='center'>CLASS DELETED SUCCESSFULLY</br>"
						+ "<a href='admin-page.html'>RETURN To MainMenu</a>"
						+ "</div>");
			}
			session.close();
		} catch (Exception e) {
			out.println("<div align='center'>TRY AGAIN..."
					+ "<a href='admin-page.html'>RETURN To MainMenu</a>"
					+ "</div>");
		}
	}

}