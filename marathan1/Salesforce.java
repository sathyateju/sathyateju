package marathan1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.sukgu.Shadow;

public class Salesforce {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        driver.findElement(By.id("password")).sendKeys("Leaf@123");
        driver.findElement(By.id("Login")).click();
        driver.findElement(By.xpath("//span[text()='Learn More']")).click();
        Thread.sleep(100);
        Set<String> windowHandles = driver.getWindowHandles();
        List<String>lstWindow = new ArrayList<String>(windowHandles);
        driver.switchTo().window(lstWindow.get(1));
        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        Shadow dom = new Shadow(driver);
        dom.setImplicitWait(20);
        WebElement ele = dom.findElementByXPath("//span[text()='Learning']");
        ele.click();
        //Shadow doms = new Shadow(driver);
        //doms.setImplicitWait(20);
        WebElement trailhead = dom.findElementByXPath("//span[text()='Learning on Trailhead']");
        Actions action = new Actions(driver);
		action.moveToElement(trailhead).perform();
		Shadow doms = new Shadow(driver);
        doms.setImplicitWait(20);
       WebElement certificate = dom.findElementByXPath("//a[text()='Salesforce Certification']");
       certificate.click();  
       String text = driver.findElement(By.xpath("//h1[text()='Earn your Credential']")).getText();
       System.out.println(text);
       WebElement scroll = driver.findElement(By.xpath("(//div[@class='credentials-card '])[6]"));
       Actions builder = new Actions(driver);
       builder.scrollToElement(scroll).perform();
       List<WebElement> certificates = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
       for (int i = 0; i < certificates.size(); i++) {
           
           String certificate_list = certificates.get(i).getText();
           
           System.out.println(certificate_list);    
       }
       
       File source = driver.getScreenshotAs(OutputType.FILE);
       File dest=new File ("./snap/salesforce.png");
       FileUtils.copyFile(source, dest);
       driver.close();
	}

}
