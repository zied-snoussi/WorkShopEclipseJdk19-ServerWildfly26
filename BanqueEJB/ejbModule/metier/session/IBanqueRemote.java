package metier.session;

import java.util.List;

import javax.ejb.Remote;

import metier.entities.Compte;
@Remote
public interface IBanqueRemote {
	public void addCompte(Compte c);
	public List<Compte> getAllComptes();
	public Compte getCompte(int c);
	public void verser(double mt,int code);
	public void retirer(double mt,int code);
	public void virement(double mt,int cpte1,int cpte2);
	public void updateCompte(Compte c);
	public void supprimerCompte(int code);
}
