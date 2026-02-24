package Sample;
import java.io.InterruptedIOException;
import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
public class Instagram {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.edge.driver", "F:\\Tasks\\SampleTest\\target\\msedgedriver.exe");
		 WebDriver w = new EdgeDriver();
		 String url = "https://www.instagram.com/";
		 w.navigate().to(url);
		// Thread.sleep(2000);
		 w.navigate().refresh();
		// w.navigate().back();
		 Thread.sleep(1000);
		 w.get("https://www.instagram.com/");
		 w.manage().window().maximize();
		 
		 WebElement email = w.findElement(By.xpath("//input[@name ='email']"));
		 email.sendKeys("Sivanesh_kasi");
		 WebElement pass = w.findElement(By.xpath("//input[@name='pass']"));
		 if(pass.isDisplayed()) {
			 pass.sendKeys("98423a@");
		 }
		// WebElement login1 = w.findElement(By.partialLinkText("Log"));
		// login1.click();
		WebElement login = w.findElement(By.xpath("//span[text() ='Log in']"));
		 login.click();
		
		List<WebElement> Elements =  w.findElements(By.tagName("a"));
		 for(int i = 0; i<Elements.size();i++)
		 {
			 WebElement Element = Elements.get(i);
			 String data= Element.getText();
			 System.out.println(data);
		 }
		 
		 

	}

}
