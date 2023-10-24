
package com.programacion2.parcial2.persitencia;

import com.programacion2.parcial2.logica.Personaje;
import com.programacion2.parcial2.persitencia.exceptions.NonexistentEntityException;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;


public class PersonajeJpaController implements Serializable {

        public PersonajeJpaController() {
        emf = Persistence.createEntityManagerFactory("persistencia");
    }

    
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Personaje personaje) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(personaje);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Personaje personaje) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            personaje = em.merge(personaje);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = personaje.getIdPersonaje();
                if (findPersonaje(id) == null) {
                    throw new NonexistentEntityException("The personaje with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(int id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Personaje personaje;
            try {
                personaje = em.getReference(Personaje.class, id);
                personaje.getIdPersonaje();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The personaje with id " + id + " no longer exists.", enfe);
            }
            em.remove(personaje);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Personaje> findPersonajeEntities() {
        return findPersonajeEntities(true, -1, -1);
    }

    public List<Personaje> findPersonajeEntities(int maxResults, int firstResult) {
        return findPersonajeEntities(false, maxResults, firstResult);
    }

    private List<Personaje> findPersonajeEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Personaje.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Personaje findPersonaje(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Personaje.class, id);
        } finally {
            em.close();
        }
    }

    public int getPersonajeCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Personaje> rt = cq.from(Personaje.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
