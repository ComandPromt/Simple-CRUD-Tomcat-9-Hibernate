package utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EntityManagerSingleton{
	private static EntityManagerFactory emf;

	public static EntityManager getEntityManager() {	
		if (emf == null) {
			 emf = Persistence.createEntityManagerFactory("TEST_PERSISTENCE_JPA");
		}
		EntityManager em = emf.createEntityManager();
		return em;
	}
}