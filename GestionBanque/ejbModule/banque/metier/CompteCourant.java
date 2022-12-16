package banque.metier;

import java.util.Date;

public class CompteCourant extends Compte{
	private String decouvert;

	public CompteCourant(float solde, Date date_creat, String decouvert) {
		super(solde, date_creat);
		this.decouvert = decouvert;
	}

	public CompteCourant() {
		super();
	}

	public String getDecouvert() {
		return decouvert;
	}

	public void setDecouvert(String decouvert) {
		this.decouvert = decouvert;
	}

	@Override
	public String toString() {
		return "CompteCourant [decouvert=" + decouvert + "]";
	}
	
}
