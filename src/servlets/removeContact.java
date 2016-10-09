package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.ContactDAO;

/**
 * Servlet implementation class removeContact
 */
public class removeContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String id;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public removeContact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		id = request.getParameter("c1");
		System.out.println("L'element " + id + "a ete supprime");
		ContactDAO contact = new ContactDAO();
		contact.removeContact(id);
		response.sendRedirect("displayContacts.jsp");
	}

}
