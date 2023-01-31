package Métodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Métodos {
	
	// Local onde é armazenado os comandos usados.
	WebDriver driver;
	
	// Comando automatizado para clicar.
	public void clicar(By elemento) {
	driver.findElement(elemento).click();
}
	
	// Comando automatizado para Preencher. 
	public void preencher(By elemento, String texto) {
	driver.findElement(elemento).sendKeys(texto);
}
	
   // Comando automatizado para pausar.
   public void pausar(int tempo) throws InterruptedException {
   Thread.sleep(10000);
}
	
   // Comando automatizado para fechar site WEB.
   public void fecharNavegador() {
   driver.quit();
}

  // Comando automatizado para abrir navegador.
  public void abrirNavegador(String url) {
  System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
  driver = new ChromeDriver();
  driver.manage().window().maximize();
  driver.get(url);
}
   
  // Comando automatizado para validar textos.
  public void validarTexto(By elemento, String texto) {
  String textoTela = driver.findElement(elemento).getText();	
  System.out.println(textoTela);
  assertEquals(texto,textoTela);
}
  
  // Comando automatizado para preencher numeros inteiros.
  public void preencherInteiro (CharSequence[] valor, By element) {
	  driver.findElement(element).sendKeys(valor);
  }
  
}
