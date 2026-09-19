package controller;

import java.io.IOException;
import java.util.List;

import jakarta.persistence.TypedQuery;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.Transaction;

import bo.InvitadoBo;
import entities.Invitado;

/**
 * Servlet implementation class Prueba
 */
@WebServlet("/Prueba")
public class Prueba extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Prueba() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("HOLA");
		InvitadoBo profesorBO = new InvitadoBo();
	
		
		Invitado invitado = new Invitado();
		
		invitado.setNombre(request.getParameter("nombre"));
		
		List<Invitado>lista = null;
		
		Object resultado = null;
		
		String pagina="";
		
		pagina="index.jsp";
		
		switch(request.getParameter("op")) {
		
		case "1":
			
			lista=profesorBO.consultarInvitados();
			
			resultado=lista;
			
			pagina="consulta.jsp";
			
			break;
		
		case "2":
			
			profesorBO.insertInvitado(invitado);
			
			break;
		
		case "3":
			
			invitado.setId(1);	
			
			profesorBO.deleteInvitado(invitado);

			break;
		
		}
			
		request.setAttribute("resultado", resultado);
	
		request.getRequestDispatcher(pagina).forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
