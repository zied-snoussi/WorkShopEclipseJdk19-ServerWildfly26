package banque.metier;

public class Client {
	private Long numCli;
	private String nom;
	private Compte c;
	public Long getNumCli() {
		return numCli;
	}
	public void setNumCli(Long numCli) {
		this.numCli = numCli;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Compte getCpte() {
		return c;
	}
	public void setCpte(Compte cpte) {
		this.c = cpte;
	}
	public Client(Long numCli, String nom, Compte c) {
		super();
		this.numCli = numCli;
		this.nom = nom;
		this.c = c;
	}
	@Override
	public String toString() {
		return "Client [numCli=" + numCli + ", nom=" + nom + ", c=" + c + "]";
	}
	
	
}
