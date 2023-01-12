package marathan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RedBus {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[@class='selected']//i")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[@class='selected']//i")).click();
		driver.findElement(By.xpath("//td[text()='13']")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		WebElement findElement = driver.findElement(By.xpath("//i[@class='icon icon-close']"));
		driver.executeScript("arguments[0].click();",findElement);
		String text = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
        System.out.println(text);
        driver.findElement(By.xpath("//label[@title='SLEEPER']")).click();
        String text2 = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
        System.out.println(text2);
        String text3 = driver.findElement(By.xpath("(//div[text()='KMRL Kalaimakal'])[2]")).getText();
        System.out.println(text3);
        driver.findElement(By.xpath("(//div[text()='View Seats'])[2]")).click();
        String text4 = driver.findElement(By.xpath("(//div[text()='13'])[1]")).getText();
        System.out.println(text4);
	}

}
