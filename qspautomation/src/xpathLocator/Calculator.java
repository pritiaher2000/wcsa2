package xpathLocator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net");
		
		driver.findElement(By.xpath("//span[@onClick='r(1)' and .='1']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='sciop' and .='+']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(2)' and .='2']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		String result = driver.findElement(By.id("sciOutPut")).getText();
		System.out.println(result);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@onClick='r(4)' and .='4']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='sciop' and .='–']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(2)' and .='2']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		String result1 = driver.findElement(By.id("sciOutPut")).getText();
		System.out.println(result1);
driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@onClick='r(1)' and .='1']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='sciop' and .='×']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(2)' and .='2']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		String result2 = driver.findElement(By.id("sciOutPut")).getText();
		System.out.println(result2);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[@onClick='r(3)' and .='3']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class='sciop' and .='/']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(1)' and .='1']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		driver.findElement(By.xpath("//span[@onClick='r(0)' and .='0']")).click();
		Thread.sleep(1000);
		String result3 = driver.findElement(By.id("sciOutPut")).getText();
		System.out.println(result3);
		driver.navigate().refresh();
		
	}
}
