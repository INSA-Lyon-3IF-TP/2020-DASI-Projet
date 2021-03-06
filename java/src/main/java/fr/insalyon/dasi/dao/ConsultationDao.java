package fr.insalyon.dasi.dao;

import fr.insalyon.dasi.metier.modele.Consultation;
import javax.persistence.EntityManager;

/**
 *
 * @author Nicolas Trouin et Fabien Narboux
 */
public class ConsultationDao {
    
    public void creer(Consultation consultation) {
        EntityManager em = JpaUtil.obtenirContextePersistance();
        em.persist(consultation);
    }
    
    public Consultation chercherParId(Long consultationId) {
        EntityManager em = JpaUtil.obtenirContextePersistance();
        return em.find(Consultation.class, consultationId); // renvoie null si l'identifiant n'existe pas
    }

    public void modifier(Consultation consultation) {
        EntityManager em = JpaUtil.obtenirContextePersistance();
        em.merge(consultation);
    }
}
