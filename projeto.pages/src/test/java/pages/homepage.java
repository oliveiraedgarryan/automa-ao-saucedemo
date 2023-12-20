package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class homepage {
	
	
	Metodos metodo = new Metodos();
	
	private By username = By.xpath("//input[@id='user-name']");
	private By password = By.xpath("//input[@id='password']");
	private By btnLogin = By.xpath("//input[@id='login-button']");
	private By msgErro = By.xpath("//h3[@data-test='error']");

	
	public void loginError(String username,String password , String msgErro){
		metodo.escrever(this.username,username);
		metodo.escrever(this.password,password);
		metodo.clicar(btnLogin);
		metodo.validarTexto(this.msgErro,msgErro);
		
		
	}
	
	

}
