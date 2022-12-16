package bean.session;

import javax.ejb.Remote;

import bean.entite.Client;
@Remote
public interface GestionClient {
	public void ajouterClient(Client c);
	public Client chercherClient(String adresse);
	public String chercherTel(Long code);
	public void supprimerClient(Long code);
	public void updateTelPortClient(Long code,String tel);
	public void updateTelFixClient(Long code,String tel);
	public void updateAdresseClient(Long code,String adresse);
}
