package operationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions2Method {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/HTML/html%20file/multiselectdropdown.html");
		WebElement multiselectdd= driver.findElement(By.id("menu"));
		Select sel= new Select(multiselectdd);
		List<WebElement> allOps = sel.getOptions();
		for (WebElement op:allOps)
		{
			String text = op.getText();
			System.out.println(text);
			Thread.sleep(1000);
		}
		}
	}
