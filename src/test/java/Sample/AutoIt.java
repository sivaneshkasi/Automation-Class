package Sample;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutoIt {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.edge.driver", "F:\\Tasks\\SampleTest\\target\\msedgedriver.exe");
		WebDriver w = new EdgeDriver();
		w.get( "https://www.naukri.com/registration/createAccount?othersrcp=16201&err=1&redirectTo=https%3A%2F%2Fwww.naukri.com%2Fresume-maker");
		w.manage().window().maximize();
		w.findElement(By.xpath("(//p[@class=\"main-2\"])[1]")).click();
		Thread.sleep(2000);
		w.findElement(By.xpath("//button[@class=\"uploadResume resman-btn-primary resman-btn-small\"]")).click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec("C:\\Users\\DELL\\Desktop\\NaukriUpload.exe");
	}

}
