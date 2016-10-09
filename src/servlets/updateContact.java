package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import domain.ContactDAO;

/**
 * Servlet implementation class updateContact
 */
public class updateContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String nom;
	String prenom;
    String mail;
    String id;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateContact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		System.out.println("Je suis dans le doGet()\n");

		id = request.getParameter("param1");
		System.out.println("numero id : " + id);
		nom = request.getParameter("param2");
		prenom = request.getParameter("param3");
		mail = request.getParameter("param4");
		request.setAttribute("id", id);
		request.setAttribute("nom", nom);
		request.setAttribute("prenom", prenom);
		request.setAttribute("mail", mail);
		
		request.getRequestDispatcher("/updateContact.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		System.out.println("Je suis dans le doPost()\n");
		id = request.getParameter("id");
		nom = request.getParameter("nom");
		prenom = request.getParameter("prenom");
		mail = request.getParameter("mail");
		System.out.println("id : " + id + "\nNom :" + nom + "\nPrenom : " + prenom + "\nMail : " + mail );
		ContactDAO contact = new ContactDAO();
		contact.updateContact(id, nom, prenom, mail);
		
	}

}
