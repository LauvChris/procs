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
	String deletes[];
	
       
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
	
		deletes = request.getParameterValues("c1");
		for(int i=0; i<deletes.length;i++){
			System.out.println(deletes[i]);
			ContactDAO contact = new ContactDAO();
			contact.removeContact(deletes[i]);
			System.out.println("L'element " + deletes[i] + "a ete supprime");
		}
		response.sendRedirect("displayContacts.jsp");
	}

}
