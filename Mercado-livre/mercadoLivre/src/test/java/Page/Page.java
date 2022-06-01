package Page;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page {
WebDriver driver;
	public void click(By elemento) {
		driver.findElement(elemento).click();
	}
	public void preencher(By elemento , String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}
	public void pausa (int tempo) throws InterruptedException {
		Thread.sleep(tempo);
	}
	public void pegar (By elemento) {
		driver.findElement(elemento).getText();
	}
	public void ValidarIten(String iten , By elemento) {
		assertEquals(iten , driver.findElement(elemento).getText());
		
	}
}
