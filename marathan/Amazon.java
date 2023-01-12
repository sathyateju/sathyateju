package marathan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags for boys");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        String text = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
	 System.out.println(text);
	 String text2 = driver.findElement(By.xpath("//span[text()='American Tourister']")).getText();
	 System.out.println("Third bag" +text2);
	 Thread.sleep(3000);
	 WebElement findElement = driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//input)[3]"));
	 driver.executeScript("arguments[0].click();",findElement);
	 WebElement findElement2 = driver.findElement(By.xpath("(//div[@class='a-checkbox a-checkbox-fancy s-navigation-checkbox aok-float-left']//input)[4]"));
	 driver.executeScript("arguments[0].click();",findElement2);
	 String text3 = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
	 System.out.println(text3);
	 driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']")).click();
	 driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	 String text4 = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base'])[2]")).getText();
	 System.out.println(text4);
	 String text5 = driver.findElement(By.xpath("//span[text()='(22% off)']")).getText();
	 System.out.println(text5);
	}

}
