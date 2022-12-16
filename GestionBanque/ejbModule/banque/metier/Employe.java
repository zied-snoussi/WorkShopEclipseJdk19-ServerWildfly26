package banque.metier;

public class Employe {
	private Long numEmp;
	private float solde;
	private Client c;
	public Long getNumEmp() {
		return numEmp;
	}
	public void setNumEmp(Long numEmp) {
		this.numEmp = numEmp;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public Client getC() {
		return c;
	}
	public void setC(Client c) {
		this.c = c;
	}
	public Employe(Long numEmp, float solde, Client c) {
		super();
		this.numEmp = numEmp;
		this.solde = solde;
		this.c = c;
	}
	@Override
	public String toString() {
		return "Employe [numEmp=" + numEmp + ", solde=" + solde + ", c=" + c + "]";
	}
}
