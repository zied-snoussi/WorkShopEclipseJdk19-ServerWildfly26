package banque.metier;

import java.util.Date;

public class CompteEpargne extends Compte{
	private float taux;

	public CompteEpargne(float solde, Date date_creat, float taux) {
		super(solde, date_creat);
		this.taux = taux;
	}

	public CompteEpargne() {
		super();
	}

	public float gettaux() {
		return taux;
	}

	public void settaux(float taux) {
		this.taux = taux;
	}

	@Override
	public String toString() {
		return "CompteEpargne [taux=" + taux + "]";
	}
	
}
