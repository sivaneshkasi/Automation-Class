package Sample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import java.io.*;
import java.util.List;
import java.awt.Window;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.*;

public class Flipkart {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.edge.driver", "F:\\Tasks\\SampleTest\\target\\msedgedriver.exe");
		WebDriver wd= new EdgeDriver();
		wd.get("https://www.flipkart.com/account/login?ret=/");
		wd.manage().window().maximize();
		wd.navigate().back();
		wd.switchTo().newWindow(WindowType.TAB);
		String url = "https://www.flipkart.com/account/login?ret=/";
		wd.navigate().to(url);
		String currenturl = wd.getCurrentUrl();
		System.out.println(currenturl);
		
		WebElement username = wd.findElement(By.xpath("(//form[@autocomplete='on']"));
		username.sendKeys("sivanesh_kasi");
		
		//WebElement pass = wd.findElement(By.xpath("//input[@name='pass']"));
		//pass.sendKeys("984221232");
		
		WebElement login = wd.findElement(By.xpath("//button[contains(text(),'Request')]"));
		login.click();
		TakesScreenshot ts =(TakesScreenshot)wd;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("F:\\Tasks\\SampleTest\\target\\screen.png");
		FileUtils.copyFile(src,f);		
		List<WebElement> elements = wd.findElements(By.tagName("a"));
		for(int i =0;i<elements.size();i++) {
			WebElement element = elements.get(i);
			String data = element.getText();
			System.out.println(data);
			
		}
		
	 
	}

}
