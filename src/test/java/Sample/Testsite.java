package Sample;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.edge.*;


public class Testsite {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.edge.driver","F:\\Tasks\\SampleTest\\target\\msedgedriver.exe");
		WebDriver w = new EdgeDriver();
		w.get("https://www.facebook.com/");
		w.manage().window().maximize();
		Thread.sleep(1000);
		//w.switchTo().newWindow(WindowType.TAB);
		//String url = "https://www.flipkart.com/";
		//w.navigate().to(url);
		
		//WebElement login = w.findElement(By.xpath("//span[text()='Login']"));
		WebElement user  = w.findElement(By.xpath("//input[@name='email']"));
		Actions a = new Actions(w);
		a.moveToElement(user).perform();
		//w.switchTo().newWindow(WindowType.TAB);
		//w.get("https://www.facebook.com/");
		a.sendKeys(user,"sivanesh_kasi").perform();
		a.doubleClick(user).build().perform();
		
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		

		WebElement login = w.findElement(By.xpath("//button[@name='login']"));
		login.click();
		w.switchTo().newWindow(WindowType.TAB);
		w.get(" https://demo.guru99.com/test/drag_drop.html");
	
		WebElement drag= w.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement drop=w.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement drag2=w.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement drag3=w.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement drop3=w.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement drop1=w.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement drop2= w.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		 
		a.dragAndDrop(drag,drop ).perform();
		a.dragAndDrop(drag, drop2 ).perform();
		a.dragAndDrop(drag2,drop3  ).perform();
		a.dragAndDrop(drag3, drop1 ).perform();
		Thread.sleep(2000);
		a.sendKeys(Keys.PAGE_DOWN).perform();
		
		
		TakesScreenshot ts = (TakesScreenshot)w;
		File f = ts.getScreenshotAs(OutputType.FILE);
		File src = new File("F:\\Tasks\\SampleTest\\target\\Screen1.png");
		FileUtils.copyFile(f, src);
		
		w.switchTo().newWindow(WindowType.TAB);
		w.get("https://demo.automationtesting.in/Alerts.html");
		WebElement first = w.findElement(By.xpath("//button[@class='btn btn-danger']"));
		first.click();	       
		Alert alert = w.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		w.findElement(By.xpath("(//a[@data-toggle='tab'])[2]")).click();
		w.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
		Thread.sleep(2000);
		alert.accept();	
		
		w.findElement(By.xpath("(//a[@class=\"analystic\"])[3]")).click();
		w.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
		Thread.sleep(2000);
		String s = alert.getText();
		System.out.println(s);
		alert.sendKeys("Hi Sivanesh Testing");
		alert.accept();
		Thread.sleep(1000);
		
		String sl = "https://www.globalsqa.com/demo-site/select-dropdown-menu/";
		w.navigate().to(sl);
		WebElement dorp= w.findElement(By.tagName("select"));
		Select se = new Select(dorp);
		se.selectByIndex(10);
		Thread.sleep(1000);
		se.selectByValue("ARG");
		Thread.sleep(1000);
		se.selectByVisibleText("India");
		
		List<WebElement> l = se.getOptions();
		System.out.println(l.size());
		for(int i = l.size()-1; i>=0;i--) {
			String  g = l.get(i).getText();
			System.out.println(g);
		}
		
		w.switchTo().newWindow(WindowType.TAB);
		w.get("https://www.globalsqa.com/demo-site/select-elements/#Multiple%20Selection");
		
       WebElement ee = w.findElement(By.xpath("(//ol[@id='selectable'])[1]"));
        Select ss = new Select(ee);
        ss.selectByIndex(0);
        ss.selectByValue("item 3");
		Thread.sleep(1000);		
		
		
		boolean is= se.isMultiple();
		System.out.println(is);
		
		
		
	}

}