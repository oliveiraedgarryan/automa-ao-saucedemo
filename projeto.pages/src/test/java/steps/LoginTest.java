package steps;

import org.jsoup.nodes.Element;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import metodos.Metodos;
import pages.homepage;
import runner.Executa;

public class LoginTest {
	
	homepage home = new homepage();
	
	@Before
	public void iniciarTest() {
		Executa.abrirNavegador();
	}
	
	@After
	public void finalizarTeste() {
		Executa.fecharNavegador();
		
	}
	
	@Test
	public void loginBloqueado() {
		home.loginError("", "", "");
	
		
	}
	
//	@Test
	public void senhaInvalida() {
		home.loginError("", null, null);
		
	}
	@Test
	public void usuarioInvalido() {
		home.loginError(null, null, null);
		
	}
}
