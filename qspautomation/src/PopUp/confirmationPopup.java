package PopUp;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class confirmationPopup {
	
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("file:///C:/Users/admin/Desktop/HTML/html%20file/confirmation.html");
	driver.findElement(By.xpath("//button[.='I am Hungry']")).click();
	Thread.sleep(2000);
	Alert al = driver.switchTo().alert();
	al.dismiss();
	
}
}
