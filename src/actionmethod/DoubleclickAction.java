package actionmethod;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleclickAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.manage().window().maximize();
	     
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	     
	     driver.get("http://127.0.0.1/login.do;jsessionid=1bl7tny1ouhmq");
	 
		   driver.findElement(By.name("username")).sendKeys("admin");
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   driver.findElement(By.id("loginButton")).click();
		   
		   driver.findElement(By.xpath("//div[.='Settings']/following-sibling::img")).click();
		   
		   Thread.sleep(2000);
		   
		                   WebElement target = driver.findElement(By.partialLinkText("Logo & Color Scheme"));
		   
		                   Actions act = new Actions(driver);
		                   act.moveToElement(target).perform();
		                   target.click();
		                  
		                  
		                   Thread.sleep(2000);
		                   driver.findElement(By.xpath("//lable[@for='uploadNewLogoOption']"));
		                   
		   
		   
		   
		   
		   
		   
		   
		   
		   
	}

}
