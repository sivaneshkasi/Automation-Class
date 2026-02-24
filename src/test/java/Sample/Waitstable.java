package Sample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Waitstable {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.edge.driver", "F:\\Tasks\\SampleTest\\target\\msedgedriver.exe");
		WebDriver w = new EdgeDriver();
		JavascriptExecutor js = (JavascriptExecutor)w;
		w.get("https://selectorshub.com/iframe-in-shadow-dom/");
		w.manage().window().maximize();
		WebElement shadow = w.findElement(By.xpath("//div[@id='userName']"));
		Thread.sleep(2000);
		js.executeScript("arguments[0].shadowRoot.querySelector('a').click()", shadow);
	}

}
