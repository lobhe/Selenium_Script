package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.event.KeyValuePair;

public class Onlinecalculator_byactionmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.get("https://www.online-calculator.com/");
         
       WebElement target = driver.findElement(By.xpath("//h1[.='Downloads']"));
         
                        Actions act = new Actions(driver);
                        //to perform right click method
                        act.contextClick(target).perform();
                        
                       
                        
	}

}
