package metier.session;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import metier.entities.Compte;
@Stateless(name="BK")
public class BanqueEJBImpl implements IBanqueLocal,IBanqueRemote{
	@PersistenceContext(unitName="UP_BANQUE")
	private EntityManager em;
	@Override
	public void addCompte(Compte c) {
		em.persist(c);
	}

	@Override
	public List<Compte> getAllComptes() {
		Query req=em.createQuery("select c from Compte c where c.active=true");
		return req.getResultList();
	}

	@Override
	public Compte getCompte(int c) {
		Compte cp=em.find(Compte.class, c);
		if(cp==null) throw new RuntimeException("Compte introuvable");
		return cp;
	}

	@Override
	public void verser(double mt, int code) {
		Compte cp=getCompte(code);
		cp.setSolde(cp.getSolde()+mt);
		em.persist(cp);
	}

	@Override
	public void retirer(double mt, int code) {
		Compte cp=getCompte(code);
		cp.setSolde(cp.getSolde()-mt);
		em.persist(cp);
	}

	@Override
	public void virement(double mt, int cpte1, int cpte2) {
		retirer(mt,cpte1);
		verser(mt,cpte2);
	}

	@Override
	public void updateCompte(Compte c) {
		em.merge(c);
	}

	@Override
	public void supprimerCompte(int code) {
		Compte cp=getCompte(code);
		em.remove(cp);
	}
	
}
