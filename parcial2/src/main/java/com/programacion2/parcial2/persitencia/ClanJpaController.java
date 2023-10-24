/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.programacion2.parcial2.persitencia;

import com.programacion2.parcial2.logica.Clan;
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


public class ClanJpaController implements Serializable {

    private EntityManagerFactory emf = null;

    public ClanJpaController() {
        emf = Persistence.createEntityManagerFactory("persistencia");
    }

    
    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Clan clan) {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(clan);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Clan clan) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            clan = em.merge(clan);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                int id = clan.getIdClan();
                if (findClan(id) == null) {
                    throw new NonexistentEntityException("The clan with id " + id + " no longer exists.");
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
            Clan clan;
            try {
                clan = em.getReference(Clan.class, id);
                clan.getIdClan();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The clan with id " + id + " no longer exists.", enfe);
            }
            em.remove(clan);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Clan> findClanEntities() {
        return findClanEntities(true, -1, -1);
    }

    public List<Clan> findClanEntities(int maxResults, int firstResult) {
        return findClanEntities(false, maxResults, firstResult);
    }

    private List<Clan> findClanEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Clan.class));
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

    public Clan findClan(int id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Clan.class, id);
        } finally {
            em.close();
        }
    }

    public int getClanCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Clan> rt = cq.from(Clan.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
