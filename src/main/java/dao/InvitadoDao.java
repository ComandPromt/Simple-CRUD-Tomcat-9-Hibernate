package dao;

import jakarta.persistence.EntityManager;

import entities.Invitado;

public class InvitadoDao {
	public void insertarInvitado(EntityManager em, Invitado p) {
		em.persist(p);
	}

	public void borrarInvitado(EntityManager em, int id) {
		Invitado invitado = em.find(Invitado.class, id);
		em.remove(invitado);
	}
}
