package marathan1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class OrderingMobile {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://dev62925.service-now.com/");
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("GAhMak34tH-^");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		Shadow dom = new Shadow(driver);
        dom.setImplicitWait(20);
        WebElement ele = dom.findElementByXPath("//div[text()='All']");
        ele.click();
        WebElement ser = dom.findElementByXPath("//span[text()='Service Catalog']");
        ser.click();
        WebElement frame = dom.findElementByXPath("//iframe[@title='Main Content']");
        driver.switchTo().frame(frame);
        
        driver.findElement(By.xpath("//h2[contains(text(),'Mobiles')]")).click();
        driver.findElement(By.xpath("//strong[text()='Apple iPhone 13']")).click();
        driver.findElement(By.xpath("(//label[@class='radio-label'])[2]")).click();
        driver.findElement(By.xpath("//option[text()='Unlimited']")).click();
        driver.findElement(By.xpath("(//label[@class='radio-label'])[5]")).click();
        driver.findElement(By.xpath("//label[text()='128 GB']")).click();
        driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
        
        String text = driver.findElement(By.xpath("//span[text()='Thank you, your request has been submitted']")).getText();
        System.out.println(text);
        String text2 = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
        System.out.println(text2);
        File source = driver.getScreenshotAs(OutputType.FILE);
        File dest=new File ("./snap/mobile.png");
        FileUtils.copyFile(source, dest);
	}

}
