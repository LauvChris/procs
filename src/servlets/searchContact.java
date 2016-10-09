package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.ContactDAO;

/**
 * Servlet implementation class searchContact
 */
public class searchContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String nom;
	String prenom;
    String mail;   
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchContact() {
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
		nom = request.getParameter("nom");
		prenom = request.getParameter("prenom");
		mail = request.getParameter("mail");
		ContactDAO contact = new ContactDAO();
		contact.searchContact();
		response.sendRedirect("Main.jsp");
	}

}
