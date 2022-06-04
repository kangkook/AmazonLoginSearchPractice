package amazon;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonLogin {

WebDriver driver;
	
	@BeforeClass
	    public void amazonSetUp() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
        
//        driver.get("http://practice.automationtesting.in/");
        
        
        
        // implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
	
	@Test
	public void amazonLogin() {
			
			WebElement amazonLogin = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]"));
			
			amazonLogin.click();
			



			
	}

//	@AfterClass
//	public void tearDown() {
//		driver.close();
//			
//	}

	}
					
			
