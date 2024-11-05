package assertion;

import static org.testng.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertEquals 
{
	@Test
	public void TestAsert() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("APjFqb")).sendKeys("gmail",Keys.ENTER);
		Thread.sleep(2000);
		String exptdTitle="gmail - Google Search";// give space here or else TC will get fail
		String actTitle= driver.getTitle();
		assertEquals(exptdTitle,actTitle);
		driver.close();
		}

	
	}


