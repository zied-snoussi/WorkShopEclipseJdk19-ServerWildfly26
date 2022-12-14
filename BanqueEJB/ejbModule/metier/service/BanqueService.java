package metier.service;

import java.util.Date;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.ParameterStyle;
import javax.jws.soap.SOAPBinding.Use;

import metier.entities.Compte;
import metier.session.IBanqueLocal;
@Stateless
@WebService
@SOAPBinding(use=Use.LITERAL, parameterStyle=ParameterStyle.BARE)
public class BanqueService {
	@EJB//(beanName="BK")
	private IBanqueLocal metier;
	@WebMethod(operationName="AjouterCompte")
	public void addCompte(@WebParam(name="solde")double soldeInitial){
		Compte cp=new Compte(soldeInitial,new Date(), true);
		metier.addCompte(cp);
	}
	@WebMethod(operationName="AfficherlesComptes")
	public List<Compte>listCompte(){
		return metier.getAllComptes();
	}
	@WebMethod(operationName="AfficherCompte")
	public Compte getCompte(@WebParam(name="code")int code){
		return metier.getCompte(code);
	}
	@WebMethod//(exclude=true)
	public void verser(@WebParam(name="montant")double mt,@WebParam(name="code")int code){
		metier.verser(mt,code);
	}
	@WebMethod//(exclude=true)
	public void retirer(@WebParam(name="montant")double mt,@WebParam(name="code")int code){
		metier.retirer(mt,code);
	}
	@WebMethod(operationName="AppliquerVirement")
	//@WebResult(name="LeVirementBancaireEstEffectuĂ©")
	public void virement(@WebParam(name="montant")double mt,@WebParam(name="compte1")int cpte1,@WebParam(name="compte2")int cpte2){
		metier.virement(mt,cpte1,cpte2);
	}
}
