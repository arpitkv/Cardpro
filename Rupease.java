import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Rupease {
	public WebDriver driver;
	public WebDriverWait wait;
	// Site link
	public String url = "http://192.168.1.145/cardpro/client/rupease/";
	public WebElement newelement;

	// open the Site in browser
	@BeforeTest
	public void siteOpen() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(url);
		System.out.println("User login");
		wait = new WebDriverWait(driver, 5);
	}




	// home page verify
	@Test(priority = 0)
	public void verifyTitle() {
		String expectedTitle = "Rupease";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		System.out.println("home page verify");
	}

	// Verify the home logo link
	@Test(priority = 1)
	public void logoClick() {
		newelement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='top_top']/a/img")));
		driver.findElement(By.xpath(".//*[@class='top_top']/a/img")).click();

	}

	// Verify the mobile link
	@Test(priority = 2)
	public void mobileLink() {
		newelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='mobile_l']")));
		System.out.println("pass");
		driver.findElement(By.xpath(".//*[@id='mobile_l']")).click();
	}

	// Verify the dth link
	@Test(priority = 3)
	public void dthLink() {
		newelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='dth_l']/span/img")));
		driver.findElement(By.xpath(".//*[@id='dth_l']/span/img")).click();
	}

	// Verify the electricity link
	@Test(priority = 4)
	public void electricityLink() {
		newelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='electricity_l']")));
		driver.findElement(By.xpath(".//*[@id='electricity_l']")).click();

	}

	// Verify the Flight link
	@Test(priority = 5)
	public void flightLink() {
		newelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='flight_l']")));
		driver.findElement(By.xpath(".//*[@id='flight_l']")).click();
	}

	// Verify the Bus link
	@Test(priority = 6)
	public void busLink() {
		newelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='bus_l']")));
		driver.findElement(By.xpath(".//*[@id='bus_l']")).click();
	}

	// Verify the cab link
	@Test(priority = 7)
	public void cabLink() {
		newelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='cab_l']")));
		driver.findElement(By.xpath(".//*[@id='cab_l']")).click();
	}

	// Verify the cab link
	@Test(priority = 8)
	public void hotelLink() {
		newelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='hotel_l']")));
		driver.findElement(By.xpath(".//*[@id='hotel_l']")).click();
	}

	// Verify the shopping link
	@Test(priority = 9)
	public void shoppingLink() {
		newelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='shopping_l']")));
		driver.findElement(By.xpath(".//*[@id='shopping_l']")).click();
	}

	// Shopping page verify
	@Test(priority = 10)
	public void verifyshoppingTitle() {
		String expectedTitle = "Rupease";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	// Verify the back button link from Shopping page
	@Test(priority = 11)
	public void shoppingbackLink() {
		newelement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='top_top']/a/img")));
		driver.navigate().back();
	}

	// Verify the electronic link
	@Test(priority = 12)
	public void electronicLink() {
		newelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='electronic_l']")));
		driver.findElement(By.xpath(".//*[@id='electronic_l']")).click();
	}

	// electronic page verify
	@Test(priority = 13)
	public void verifyelectronicTitle() {
		String expectedTitle = "Rupease";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	// Verify the back button link from electronic page
	@Test(priority = 14)
	public void electronicbackLink() {
		newelement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='top_top']/a/img")));
		driver.navigate().back();
	}

	// Verify the flower link
	@Test(priority = 15)
	public void flowerLink() {
		newelement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='flower_l']")));
		driver.findElement(By.xpath(".//*[@id='flower_l']")).click();
	}

	// electronic page verify
	@Test(priority = 16)
	public void verifyflowerTitle() {
		String expectedTitle = "Rupease";
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	// Verify the back button link from electronic page
	@Test(priority = 17)
	public void flowerbackLink() {
		newelement = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@class='top_top']/a/img")));
		driver.navigate().back();
	}

	// browser closed
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
