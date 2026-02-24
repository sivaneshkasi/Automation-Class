package Sample;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;




public class TotalWebsiteRun {

	public static void main(String[] args) throws InterruptedException, AWTException{
		 System.setProperty("webdriver.edge.driver", "F:\\Tasks\\SampleTest\\target\\msedgedriver.exe");
		 WebDriver w = new EdgeDriver();
		 w.get("https://www.facebook.com/");
		 w.manage().window().maximize();
		 Thread.sleep(2000);
		WebElement user =  w.findElement(By.name("email"));
		user.sendKeys("Sivanesh_kasi");
		Actions action = new Actions(w);
		WebElement pass = w.findElement(By.name("pass"));
		action.sendKeys(pass,"12345siva@").perform();
		Thread.sleep(1000);
		Robot r = new Robot();
		WebElement login = w.findElement(By.xpath("//button[@name='login']"));
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		List<WebElement> ld = w.findElements(By.tagName("a"));
		for(int i =0;i<ld.size();i++) {
			String sdd = ld.get(i).getText();
			System.out.println(sdd);
		}
		
		w.switchTo().newWindow(WindowType.TAB);
		w.get("https://demo.automationtesting.in/Alerts.html");
		
		WebElement first = w.findElement(By.xpath("//button[@class=\"btn btn-danger\"]"));
		first.click();
		Alert alert = w.switchTo().alert();
		Thread.sleep(2000);
		alert.accept();
		
		w.findElement(By.xpath("//a[text()=\"Alert with Textbox \"]")).click();
		w.findElement(By.xpath("//button[@onclick=\"promptbox()\"]")).click();
		Thread.sleep(2000);
		alert.sendKeys("Hi sivanesh");
		String s = alert.getText();
		alert.accept();
		System.out.println(s);
		String ss  = "https://www.globalsqa.com/demo-site/select-dropdown-menu/";
		w.navigate().to(ss);
		WebElement drop = w.findElement(By.tagName("select"));
		Select se = new Select(drop);
		se.selectByIndex(2);
		//se.selectByValue("asm");
		se.selectByVisibleText("India");
		
		List<WebElement> lc = se.getOptions();
		System.out.println(lc.size());
		for(int i = 0;i<lc.size();i++) {
			String te = lc.get(i).getText();
			System.out.println(te);
		}
		
		w.switchTo().newWindow(WindowType.TAB);
		w.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		w.findElement(By.xpath("(//input[@name='q'])[1]")).sendKeys("samsung mobiles",Keys.ENTER);
		w.findElement(By.xpath("//div[@class=\"RG5Slk\"][1]")).click();
		 w.findElement(By.xpath("(//div[@class=\"RG5Slk\"])[2]")).click();
		 w.findElement(By.xpath("(//div[@class=\"RG5Slk\"])[3]")).click();
		 w.findElement(By.xpath("(//div[@class=\"RG5Slk\"])[4]")).click();
		 
		 String parent = w.getWindowHandle();
		 System.out.println(parent);
		 Set<String> allUrl = w.getWindowHandles();
		 System.out.println(allUrl);
		 
		 List<String> ll= new ArrayList<>(allUrl);
		 Thread.sleep(2000);
		 w.switchTo().window(ll.get(1));
		 w.switchTo().window(parent);
		 
		w.switchTo().newWindow(WindowType.TAB);
		w.get("https://demo.guru99.com/test/web-table-element.php");
		WebElement table= w.findElement(By.tagName("table"));
		WebElement body = table.findElement(By.tagName("tbody"));
		List<WebElement> row = body.findElements(By.tagName("tr"));
			WebElement er = row.get(2);
		
		List<WebElement> lr = er.findElements(By.tagName("td"));
		String data =lr.get(0).getText();
		String data1= lr.get(3).getText();
		System.out.println(data);
		System.out.print("\t"+data1);
		
		
		//w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//WebDriverWait wait = new WebDriverWait(w,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("user")));
		//Wait<WebDriver> waiting = new FluentWait(w).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
	}

}
