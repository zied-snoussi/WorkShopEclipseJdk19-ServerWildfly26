package banque.metier;

import java.util.List;

public class Groupe {
	private Long idGroupe;
	private String nom;
	private List<Employe> employeList;
	public Long getIdGroupe() {
		return idGroupe;
	}
	public void setIdGroupe(Long idGroupe) {
		this.idGroupe = idGroupe;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Employe> getEmployeList() {
		return employeList;
	}
	public void setEmployeList(List<Employe> employeList) {
		this.employeList = employeList;
	}
	public Groupe(Long idGroupe, String nom, List<Employe> employeList) {
		super();
		this.idGroupe = idGroupe;
		this.nom = nom;
		this.employeList = employeList;
	}
	@Override
	public String toString() {
		return "Groupe [idGroupe=" + idGroupe + ", nom=" + nom + ", employeList=" + employeList + "]";
	}
	
}
