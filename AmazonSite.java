import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSite {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));  //Implicit wait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("wrist watches");  //to enter text into search box
		driver.findElement(By.id("nav-search-submit-button")).click();         //To click on search icon


		//To click on titan filter
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='brandsRefinements']/descendant::li[@id='p_89/Titan']/span"))).click();       
        Thread.sleep(2000);
		//To click on analogue filter
		driver.findElement(By.xpath("//li[@id='p_n_feature_seven_browse-bin/1480900031']/span")).click();
		Thread.sleep(2000);
		//To click on Leather filter
		driver.findElement(By.xpath("//li[@id='p_n_material_browse/1480907031']/span")).click();
		Thread.sleep(2000);
		//To click on discount(25% or more) filter
		driver.findElement(By.xpath("//li[@id='p_n_pct-off-with-tax/2665400031']/span")).click();
		Thread.sleep(2000);
		//To select 5th watch
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@cel_widget_id='MAIN-SEARCH_RESULTS-7']"))).click();
	}
}