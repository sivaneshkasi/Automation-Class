package Sample;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.WebElement;

public class Bsexpath {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.edge.driver", "F:\\Tasks\\SampleTest\\target\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.bseindia.com/");
		d.manage().window().maximize();
		//Alert alert =d.switchTo().alert();
		//alert.dismiss();
		d.findElement(By.xpath("(//button[@class='btn-close'])[1]")).click();
		Thread.sleep(2000);
		//WebElement table = d.findElement(By.xpath("(//a[@id=\"index\"])[1]"));
		List<WebElement> lc =d.findElements(By.xpath("(//table)[6]//tbody[2]//td[4]"));
		WebElement ss =d.findElement(By.xpath("((//table)[6]//tbody//tr//td[@align=\"right\"][2])[4]"));
		System.out.println(ss.getText());
		for(WebElement x:lc) { 
			System.out.println(x.getText());
		}
		
			 
		 d.quit();
		
		
		
	}
}
