package Sample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "F:\\Tasks\\SampleTest\\target\\msedgedriver.exe");
		WebDriver w = new EdgeDriver();
		w.get("https://demo.guru99.com/test/web-table-element.php");
		w.manage().window().maximize();
		WebElement table = w.findElement(By.xpath("//table[@class=\"dataTable\"]"));
		WebElement tbody = table.findElement(By.tagName("tbody"));
		List<WebElement> trows = tbody.findElements(By.tagName("tr"));
		//for(int i =0;i<trows.size();i++) {
			WebElement element = trows.get(2);
			List<WebElement> s = element.findElements(By.tagName("td"));
			// for(int j=0;j<s.size();j++) {
			String sb= s.get(1).getText();
			System.out.println(sb);
				 String ss = s.get(3).getText();
				 
				 System.out.println(ss);
			 }
		}
		
		
	


