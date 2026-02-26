package Sample;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

 
public class Testingmine {

	public static void main(String[] args) throws AWTException, InterruptedException, IOException {
		 System.setProperty("wendriver.edge.driver","F:\\Tasks\\SampleTest\\target\\msedgedriver.exe");
		 WebDriver w = new EdgeDriver();
		 w.get("https://www.flipkart.com");
		 w.manage().window().maximize();
		 Thread.sleep(1000);
		 w.findElement(By.name("q")).sendKeys("samsung mobiles", Keys.ENTER);		 
		 w.findElement(By.xpath("(//div[@class=\"RG5Slk\"])[2]")).click();
		 w.findElement(By.xpath("(//div[@class=\"RG5Slk\"])[3]")).click();
		 w.findElement(By.xpath("(//div[@class=\"RG5Slk\"])[4]")).click();
		 w.findElement(By.xpath("(//div[@class=\"RG5Slk\"])[5]")).click();
		 w.findElement(By.xpath("(//div[@class=\"RG5Slk\"])[6]")).click();

		String parent =	w.getWindowHandle();
		System.out.println(parent);
		Set<String> allUrl= w.getWindowHandles();
		System.out.println(allUrl);
		
		List<String> l = new ArrayList(allUrl);
		Thread.sleep(1000);
		w.switchTo().window(l.get(3));
		Thread.sleep(2000);
		w.switchTo().window(parent);
		
//		for(String x : allUrl) {
//			if(!parent.equals(allUrl)) {
//				w.switchTo().window(x);
//				
//			}
//		}
//		System.out.println("child window"+w.getTitle());
	}

}
