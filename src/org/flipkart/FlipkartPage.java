package org.flipkart;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartPage {
	public static void main(String[] args) {
	System.out.println("Done");
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\ADMIN\\eclipse-workspace\\SeleniumTesting\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get(" https://www.flipkart.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement closebtn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	closebtn.click();
	WebElement searchproduct = driver.findElement(By.name("q"));
	searchproduct.sendKeys("Iphone");
	WebElement srchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
	srchbtn.click();
	List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='_4rR01T']"));
	for(int i=0;i<findElements.size();i++) {
		System.out.println(findElements.get(i).getText());
	
}
List<WebElement> findElements2 = driver.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
for(int i=0;i<findElements2.size();i++) {
System.out.println(findElements2.get(i).getText());
}
}
}


