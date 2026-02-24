package Sample;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\Tasks\\SampleTest\\target\\msedgedriver.exe");
		 WebDriver dr = new EdgeDriver();
		 //dr.get("https://www.facebook.com/");
		 dr.manage().window().maximize();
		 String url = "https://www.facebook.com/";
		 dr.navigate().to(url);
		 dr.switchTo().newWindow(WindowType.TAB);
		 Thread.sleep(2000);
		 dr.navigate().back();
		 dr.navigate().forward();
		 Thread.sleep(2000);
		 dr.navigate().refresh();
		 String currenturl = dr.getCurrentUrl();	
		 System.out.println(currenturl);
		 if(url.equals(currenturl)) {
			 System.out.println("It is matching ");
		 }
		 else {
			 System.out.println(" it is not matching");
	}
	}
}
