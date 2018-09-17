package testM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	public static void main (String [] args) throws InterruptedException {
		System.out.println("Start");
		WebDriver driver = new FirefoxDriver();
	
		driver.get("http://gmail.com");
		driver.manage().window().maximize();		
		driver.findElement(By.id("identifierId")).sendKeys("testjittest");
		driver.findElement(By.id("identifierNext")).click();
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		driver.findElement(By.name("password")).sendKeys("bullshit");
		driver.findElement(By.id("passwordNext")).click();
		WebElement element = driver.findElement(By.className("LXRPh"));
		String response = element.getText();
		System.out.println(response);
		driver.findElement(By.name("password")).sendKeys("testjittest1");
		driver.findElement(By.id("passwordNext")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".gb_9a.gbii")));
		
		driver.findElement(By.id(":68")).click();
		Thread.sleep(3000);
		driver.findElement(By.id(":67")).click();
		Thread.sleep(3000);
		driver.findElement(By.id(":69")).click();
		Thread.sleep(3000);
		driver.findElement(By.id(":6c")).click();
		Thread.sleep(3000);
		driver.findElement(By.id(":6d")).click();
		Thread.sleep(3000);
		
		// 68 69 6c 6d
		
		
		driver.findElement(By.cssSelector(".gb_9a.gbii")).click();
		driver.findElement(By.id("gb_71")).click();
		
		
		System.out.println(driver.getTitle());
		
		System.out.println("End");
		driver.close();
		
	}
}
