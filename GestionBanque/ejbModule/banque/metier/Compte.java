package banque.metier;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
@Table(name="COMPTES")
public class Compte implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CODE")
	private Long numCli;
	@Column(name="SOLDE")
	private float solde;
	@Temporal(TemporalType.TIMESTAMP)
	private Date date_creat;
	public Long getNumCli() {
		return numCli;
	}
	public void setNumCli(Long numCli) {
		this.numCli = numCli;
	}
	public float getSolde() {
		return solde;
	}
	public void setSolde(float solde) {
		this.solde = solde;
	}
	public Date getDate_creat() {
		return date_creat;
	}
	public void setDate_creat(Date date_creat) {
		this.date_creat = date_creat;
	}
	public Compte(float solde, Date date_creat) {
		super();
		this.solde = solde;
		this.date_creat = date_creat;
	}
	public Compte() {
		super();
	}
	@Override
	public String toString() {
		return "Compte [numCli=" + numCli + ", solde=" + solde + ", date_creat=" + date_creat + "]";
	}
	
}
