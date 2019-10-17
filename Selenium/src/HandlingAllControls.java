import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;
//Dipak
public class HandlingAllControls {
    public static void main(String[] args) throws InterruptedException, IOException {
    	System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	
    	String user="ranchoddassham3";//lol
    	String pass="<enter twitter pass here>";

    	
    	ChromeOptions coptions = new ChromeOptions();


    	
    	driver.get("http://twitter.com/login");

    	
    	driver.manage().window().maximize();

    	
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//input[@placeholder='Phone, email or username']")));

    	
    	WebElement userTextField = driver.findElement(By.xpath(".//input[@placeholder='Phone, email or username']"));
    	userTextField.sendKeys(user);

    	
    	WebElement PassTextField = driver.findElement(By.xpath(".//input[@class='js-password-field']"));
    	PassTextField.sendKeys(pass);

    	
    	driver.findElement(By.xpath(".//button[@type='submit']")).click();

    	
    	Thread.sleep(3000);

    	
    	WebElement tweetBox = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/header/div/div/div/div/div[3]/a/div"));
    	tweetBox.click();
    	
    	WebElement tweet = driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div[3]/div/div/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div/div/div/div/div[1]/div/div/div/div[2]/div/div/div/div"));
    	
    	tweet.sendKeys("SKNCOE");

    	
    	driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div/div/div/div/div[2]/div[2]/div/div[3]/div/div/div[1]/div/div/div/div[2]/div[2]/div/div/div[2]/div[4]/div/span/span")).click();

    	
    	Thread.sleep(2000);

    	
    	File srce = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

    	
    	Files.copy(srce, new File("F:\\LP II\\Selenium\\Tweet.png"));
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div/header/div/div/div/div/div[2]/nav/div/div/div[2]")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div/div/div[2]/div[3]/div/div/div/div/div[11]/a/div/div")).click();
    	Thread.sleep(8000);
    	
    	WebElement logout = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"react-root\"]/div/div/div[1]/div/div/div/div/div[2]/div[2]/div[3]/div[2]")));
    	logout.click();

    	
    	Thread.sleep(2000);

    	
    	driver.quit();
    	}

         
    }

    	

