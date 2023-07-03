package assignment;

public class Amazon {

	public static void main(String[] args) {
		
		
		import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;

		public class AmazonSearch {
		    public static void main(String[] args) {
		        // Set the path to the ChromeDriver executable
		    	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");

		        // Create a new instance of ChromeDriver
		        WebDriver driver = new ChromeDriver();

		        // Go to Amazon.in
		        driver.get("https://www.amazon.in");

		        // Search for "Wrist Watches" with discount "25% Off or more"
		        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		        searchBox.sendKeys("Wrist Watches");
		        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
		        searchButton.click();
		        WebElement discountFilter = driver.findElement(By.xpath("//span[text()='25% Off or more']"));
		        discountFilter.click();

		        // Get the fifth element from the search results
		        WebElement fifthElement = driver.findElement(By.xpath("(//div[@data-component-type='s-search-result'])[5]"));

		        // Extract and display the required information
		        String display = fifthElement.findElement(By.xpath("//span[contains(text(), 'Analogue')]")).getText();
		        String brandsMaterial = fifthElement.findElement(By.xpath("//a[contains(text(), 'Leather')]")).getText();
		        String brand = fifthElement.findElement(By.xpath("//span[contains(text(), 'by Titan')]")).getText();

		        System.out.println("Display: " + display);
		        System.out.println("Brands Material: " + brandsMaterial);
		        System.out.println("Brand: " + brand);

		        // Close the browser
		        driver.quit();
		    }
		}

	}

}
