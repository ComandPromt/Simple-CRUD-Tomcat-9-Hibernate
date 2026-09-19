package bo;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

import dao.InvitadoDao;
import entities.Invitado;
import utils.EntityManagerSingleton;

public class InvitadoBo {

	    public void insertInvitado(Invitado p) {
	    
	    	EntityManager em = EntityManagerSingleton.getEntityManager();
	        
	    	((EntityManager) em).getTransaction().begin();
	        
	    	InvitadoDao invidadoDAO = new InvitadoDao();
	        
	    	invidadoDAO.insertarInvitado((EntityManager) em, p);
	        
	    	((EntityManager) em).getTransaction().commit();
	        
	    	em.close();
	    
	    }
	    
	    public void deleteInvitado(Invitado p) {
		    
	    	EntityManager em = EntityManagerSingleton.getEntityManager();
	        
	    	((EntityManager) em).getTransaction().begin();
	        
	    	InvitadoDao invidadoDAO = new InvitadoDao();
	        
	    	invidadoDAO.borrarInvitado((EntityManager) em,p.getId());
	        
	    	((EntityManager) em).getTransaction().commit();
	        
	    	em.close();
	    
	    }

		public List<Invitado> consultarInvitados() {
			
			EntityManager em = EntityManagerSingleton.getEntityManager();
	  
			TypedQuery<Invitado> query5 = ((EntityManager) em).createQuery("FROM Invitado", Invitado.class);

			List<Invitado> result5=query5.getResultList();
			
	    	em.close();
	    	
	    	return result5;
	    	
		}
	    	    
}