package actionmethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
         ChromeDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
         driver.get("https://demo.guru99.com/test/drag_drop.html");
         
       WebElement src = driver.findElement(By.xpath("//a[text()=' 5000']"));
     //a[.=' BANK ']
       
       WebElement target = driver.findElement(By.xpath("//div[@id='shoppingCart4']/descendant::li[1]"));
                        Actions act = new Actions(driver);
                        
                        //to perform Drag and Drop Method click method
                        act.dragAndDrop(src, target).perform();
                        
                        
	}

}
