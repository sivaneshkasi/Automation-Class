package Sample;
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

public class Frames {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.edge.driver", "F:\\\\Tasks\\\\SampleTest\\\\target\\\\msedgedriver.exe");
		WebDriver w = new EdgeDriver();
		Actions a = new Actions(w);
		w.get("https://demo.guru99.com/test/guru99home/");
		w.manage().window().maximize();
		Thread.sleep(2000);
		a.sendKeys(Keys.PAGE_DOWN).perform();
		///List<WebElement> lc = 
			WebElement frames = w.findElement(By.xpath("//iframe[@id=\"a077aa5e\"]"));
	//	for(int i =0;i<lc.size();i++) {
		//	w.switchTo().parentFrame();
			w.switchTo().frame(frames);
		//	try {
			
			 w.findElement(By.xpath("//img[@src=\"Jmeter720.png\"]")).click();
		//		System.out.println("image found"+i);
			//	break;
//
		//	}
		//	catch(Exception e) {
		//		System.out.println("image not found"+i);
				
		//	}
		//}
		 
		 
		

	}

}
