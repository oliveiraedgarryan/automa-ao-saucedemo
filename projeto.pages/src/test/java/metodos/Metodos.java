package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers {
	

	public void escrever(By elememto, String texto) {
		driver.findElement(elememto).sendKeys(texto);
		
		
	}
	
	public void clicar (By elemento) {
		driver.findElement(elemento).click();
	}
	public void validarTexto (By elemento,String textoesperado) {
		String capturado = driver.findElement(elemento).getText();
		assertEquals(textoesperado, capturado);
				
	}

}
