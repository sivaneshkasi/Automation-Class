package Sample;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Timewaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "F:\\Tasks\\SampleTest\\target\\msedgedriver.exe");
		WebDriver w = new EdgeDriver();
		w.get("https://www.facebook.com");
		w.manage().window().maximize();
		//w.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); implicit wait 
		//WebDriverWait wait = new WebDriverWait(w,Duration.ofSeconds(10));explicit
		//WebElement user = w.findElement(By.name("email"));
	//WebElement user =	wait.until(ExpectedConditions.presenceOfElementLocated(By.name("mail"))); explicit
		//user.sendKeys("sivanesh_kasi");
		Wait<WebDriver> wait = new FluentWait<>(w)
			    .withTimeout(Duration.ofSeconds(20))
			    .pollingEvery(Duration.ofSeconds(2))
			    .ignoring(NoSuchElementException.class);	
		WebElement element = w.findElement(By.name("password"));
		element.click();
		WebDriverWait wait1 = new WebDriverWait(w,Duration.ofSeconds(10));
		WebElement user = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("user")));
		Wait<WebDriver> wait2 = new FluentWait<>(w).withTimeout(Duration.ofSeconds(20)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
	
	}

}
