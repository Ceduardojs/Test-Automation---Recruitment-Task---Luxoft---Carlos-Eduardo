package br.selenium.git.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GitHubAutoTest {

	@Test
	public void testLinks() throws InterruptedException {
		
        WebDriver driver = new FirefoxDriver();

        driver.get("https://github.com");

        WebElement element = driver.findElement(By.linkText("Explore"));
     
        if(element.isEnabled() ){
                	
        	System.out.println("ok Explore");
               	
        }
        element = driver.findElement(By.linkText("Business"));  
        if(element.isEnabled() )
        {
        	        	
            System.out.println("ok Business");
            
        }
        
        driver.findElement(By.linkText("Sign in")).click();
        driver.findElement(By.id("login_field")).clear();
        driver.findElement(By.id("login_field")).sendKeys("ceduardojs@gmail.com");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("1ddqd25!");
        driver.findElement(By.name("commit")).click();
        Thread.sleep(2000);
        
        element = driver.findElement(By.linkText("Pull requests"));
        
        if(element.isEnabled() ){
                	
        	System.out.println("ok Pull requests");
               	
        }
        
        element = driver.findElement(By.linkText("Issues"));
        
        if(element.isEnabled() ){
                	
        	System.out.println("ok Issues");
               	
        }
        
   
        driver.quit();
    }
	
   
}





