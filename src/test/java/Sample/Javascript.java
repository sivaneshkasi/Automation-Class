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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class Javascript {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.edge.driver", "F:\\Tasks\\SampleTest\\target\\msedgedriver.exe");
		WebDriver w = new EdgeDriver();
		w.get("https://www.facebook.com");
		w.switchTo().newWindow(WindowType.TAB);
		String s = "https://www.flipkart.com/";
		w.navigate().to(s);
		w.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)w;
		Thread.sleep(2000);
		WebElement search= w.findElement(By.name("q"));
		js.executeScript("arguments[0].setAttribute('value','samsung')", search);
		Object obj = js.executeScript("return arguments[0].getAttribute('value')", search);
		System.out.println(obj);
		//js.executeScript("arguments[0].click()",search);
		Thread.sleep(2000);
		WebElement title = w.findElement(By.xpath("//a[@title=\"Brand Directory\"]"));
		js.executeScript("arguments[0].scrollIntoView(true)", title);
		js.executeScript("arguments[0].setAttribute('style','Background:white;border:4px solid red')", title);
		List<WebElement> Elements =  w.findElements(By.tagName("a"));
		 for(int i = 0; i<Elements.size();i++)
		 {
			 WebElement Element = Elements.get(i);
			 String data= Element.getText();
			 System.out.println(data);
		 }
	} 

}
