package bean.entite;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CLIENTELE")
public class Client implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Client")
	private Long code;
	@Column(name="Nom_Client")
	private String nom;
	@Column(name="Prenom_Client")
	private String renom;
	@Column(name="Num_Portable_Client")
	private String telPort;
	@Column(name="Num_Fix_Client")
	private String telFix;
	@Column(name="Adresse_Client")
	private String adresse;
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getRenom() {
		return renom;
	}
	public void setRenom(String renom) {
		this.renom = renom;
	}
	public String getTelPort() {
		return telPort;
	}
	public void setTelPort(String telPort) {
		this.telPort = telPort;
	}
	public String getTelFix() {
		return telFix;
	}
	public void setTelFix(String telFix) {
		this.telFix = telFix;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public Client(String nom, String renom, String telPort, String telFix, String adresse) {
		super();
		this.nom = nom;
		this.renom = renom;
		this.telPort = telPort;
		this.telFix = telFix;
		this.adresse = adresse;
	}
	public Client() {
		super();
	}
	@Override
	public String toString() {
		return "Client [code=" + code + ", nom=" + nom + ", renom=" + renom + ", telPort=" + telPort + ", telFix="
				+ telFix + ", adresse=" + adresse + "]";
	}
	
	
}
