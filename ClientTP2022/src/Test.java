import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import bean.entite.Client;
import bean.session.GestionClientBean;

public class Test {

	public static void main(String[] args) {
		try{
		Properties jndiProperties= new Properties();
		jndiProperties.put(Context.INITIAL_CONTEXT_FACTORY,"org.wildfly.naming.client.WildFlyInitialContextFactory");
		jndiProperties.put(Context.PROVIDER_URL,"http-remoting://localhost:8081");
		Context context =new InitialContext(jndiProperties);
		GestionClientBean stub= (GestionClientBean)
		context.lookup("ejb:/TP2022/CLIENT!bean.session.GestionClientBean");
		stub.ajouterClient(new Client("Foulen","BenFoulen","75127001","75127001","sfax"));
		stub.chercherTel((stub.chercherClient("Sfax")).getCode());
		stub.updateTelPortClient(stub.chercherClient("75127001").getCode(), "57127001");
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
