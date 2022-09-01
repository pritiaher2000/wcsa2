package launchBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowserRTP {

	private static Scanner sc;

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		sc = new Scanner(System.in);
         System.out.println("enter the browser name, chrome or firefox");
         String browservalue=sc.nextLine();
         
         //browserValue variable contains the name of the browser which is supposed to be opened
         if (browservalue.equalsIgnoreCase("chrome")) {
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.google.com");
		  Thread.sleep(5000);
		}
         else if(browservalue.equalsIgnoreCase("firefox")) {
         System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
   		  driver=new FirefoxDriver();
   		  driver.manage().window().maximize();
   		  driver.get("https://www.google.com");
   		  Thread.sleep(5000);
         }
         else
         {
        	 System.out.println("type is valid");
         }	 
	}
}
