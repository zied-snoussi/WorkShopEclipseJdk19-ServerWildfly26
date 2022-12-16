package bean.session;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import bean.entite.Client;

@Stateless(name="CLIENT")
public class GestionClientBean implements GestionClient{
	@PersistenceContext(unitName="UP_CLIENT")
	private EntityManager em;
	@Override
	public void ajouterClient(Client c) {
		em.persist(c);
	}

	@Override
	public Client chercherClient(String adresse) {
		Client cp=em.find(Client.class, adresse);
		if(cp==null) throw new RuntimeException("Il n'est pas encore notre client!!!");
		return cp;
	}

	@Override
	public String chercherTel(Long code) {
		Client cp=em.find(Client.class, code);
		if(cp==null) throw new RuntimeException("Il n'est pas encore notre client!!!");
		else if(cp.getTelFix()!=null && cp.getTelPort()!=null)
			return cp.getTelFix()+" "+cp.getTelPort();
		else if(cp.getTelFix()!=null && cp.getTelPort()==null)
			return cp.getTelFix();
		else if(cp.getTelFix()==null && cp.getTelPort()!=null)
			return cp.getTelPort();
		else
			return null;
	}

	@Override
	public void supprimerClient(Long code) {
		Client cp=em.find(Client.class, code);
		if(cp==null) throw new RuntimeException("Il n'est pas encore notre client!!!");
		em.remove(cp);
		
	}

	@Override
	public void updateTelPortClient(Long code,String tel) {
		Client cp=em.find(Client.class, code);
		if(cp==null) throw new RuntimeException("Il n'est pas encore notre client!!!");
		cp.setTelPort(tel);
		em.persist(cp);
		
	}

	@Override
	public void updateTelFixClient(Long code,String tel) {
		Client cp=em.find(Client.class, code);
		if(cp==null) throw new RuntimeException("Il n'est pas encore notre client!!!");
		cp.setTelFix(tel);
		em.persist(cp);
		
	}

	@Override
	public void updateAdresseClient(Long code,String adresse) {
		Client cp=em.find(Client.class, code);
		if(cp==null) throw new RuntimeException("Il n'est pas encore notre client!!!");
		cp.setAdresse(adresse);
		em.persist(cp);
		
	}
	

}
