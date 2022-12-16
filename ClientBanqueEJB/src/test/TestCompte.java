package test;
import java.util.Date;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import metier.entities.Compte;
import metier.session.IBanqueLocal;

public class TestCompte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		Properties jndiProperties= new Properties();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,
		"org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL,"http-remoting://localhost:8081");
		Context context =new InitialContext(jndiProperties);
		IBanqueLocal stub= (IBanqueLocal)
		context.lookup("ejb:/BanqueEJB/BanqueEJBImpl!metier.session.IBanqueLocal");
		//ajout des comptes
		stub.addCompte(new Compte(1205.260f,new Date(),true));
		stub.addCompte(new Compte(50.3f,new Date(),true));
		stub.addCompte(new Compte(100.0f,new Date(),true));
		//Le versement dans le compte num�ro 2
		stub.verser(2,100);
		//La consultation du compte num 2
		Compte c=stub.getCompte(2);
		//System.out.println(c);
		//Le retrait du compte num 3
		stub.retirer(3,50);
		Thread.sleep(Integer.MAX_VALUE);
		}
		catch(NamingException e){
		e.printStackTrace();
		}
		catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
		}
}
