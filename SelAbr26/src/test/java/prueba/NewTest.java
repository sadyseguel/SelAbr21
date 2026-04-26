package prueba;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("Iniciando prueba...");

      // Configuración para evitar errores de origen y handshake
      ChromeOptions options = new ChromeOptions();
      options.addArguments("--remote-allow-origins=*");

      // Ya no necesitas System.setProperty ni el archivo .exe
      WebDriver driver = new ChromeDriver(options);
      
      try {
          driver.get("https://www.google.com");
          System.out.println("Título de la página: " + driver.getTitle());
      } catch (Exception e) {
          e.printStackTrace();
      } finally {
          // Es buena práctica cerrar el navegador al terminar
          // driver.quit(); 
      }

      System.out.println("FIN");
	  
	  
  }
}
