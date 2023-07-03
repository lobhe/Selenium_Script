package assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicates1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		    WebDriver driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("file:///C:/Users/Dyaneshwar/Desktop/SeleniumData/webelements/singledropdown.html");

		                     WebElement dropDownElement = driver.findElement(By.id("i1"));
		 
		            Select chetan = new Select(dropDownElement);
		            
		          HashSet<String> hs = new HashSet<String>();
		            
		            //get the list of webelement
		          
		        List<WebElement> allops = chetan.getOptions();
		        //read the list & get the text
		        
		        for(int i=0;i<allops.size();i++)
		        {
		                          WebElement options = allops.get(i);
		                        String text = options.getText();
		                        
		                        
		                        //add the text to set that duplicates wont be accept and
		                        // insertion order is wont be maintained
		                        hs.add(text);
		        }
		            //read the set
		        
		        for(String value:hs)
		        {
		        	System.out.println(value);
		        }
		            
		            
		            
		            
		            
		            
		            
		            
		            
	}

}
