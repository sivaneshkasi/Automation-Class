package Sample;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.WebElement;

public class Bsexpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "F:\\Tasks\\SampleTest\\target\\msedgedriver.exe");
		WebDriver d = new EdgeDriver();
		d.get("https://www.bseindia.com/");
		d.manage().window().maximize();
		//Alert alert =d.switchTo().alert();
		//alert.dismiss();
		d.findElement(By.xpath("(//button[@class='btn-close'])[1]")).click();
		
		WebElement table = d.findElement(By.xpath("(//a[@id=\"index\"])[1]"));
		List<WebElement> row = d.findElements(By.tagName("tr"));
			WebElement tdata = d.findElement(By.tagName("td"));
			WebElement tcolumn = tdata.findElement(By.tagName("tcoulumn"));
			String s =row.get(0).getText();
			String ss = tcolumn.getText();
		System.out.println(s);
		System.out.println(ss);
			 
		 
		
		
		
	}

}
