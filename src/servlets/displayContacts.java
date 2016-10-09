	package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.ContactDAO;

/**
 * Servlet implementation class displayContacts
 */
@WebServlet("/displayContacts")
public class displayContacts extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	String nom;
	String prenom;
    String groupe;
    String phone;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public displayContacts() {
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
		ContactDAO contact = new ContactDAO();
		contact.getListOfContacts();
		response.sendRedirect("displayContacts.jsp");
	}

}
