package banque.metier;

import java.util.Date;

public class Operation {
	private Long numOpt;
	private Date date_opt;
	private float montant;
	public Long getNumOpt() {
		return numOpt;
	}
	public void setNumOpt(Long numOpt) {
		this.numOpt = numOpt;
	}
	public Date getDate_opt() {
		return date_opt;
	}
	public void setDate_opt(Date date_opt) {
		this.date_opt = date_opt;
	}
	public float getMontant() {
		return montant;
	}
	public void setMontant(float montant) {
		this.montant = montant;
	}
	public Operation(Long numOpt, Date date_opt, float montant) {
		super();
		this.numOpt = numOpt;
		this.date_opt = date_opt;
		this.montant = montant;
	}
	
	
}
