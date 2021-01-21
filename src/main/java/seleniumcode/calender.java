package seleniumcode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk\\Desktop\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://demoqa.com/automation-practice-form");
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
			
			driver.findElement(By.id("firstName")).sendKeys("venki");

			driver.findElement(By.id("lastName")).sendKeys("reddy");
		    driver.findElement(By.id("userEmail")).sendKeys("venki35@example.com");
		    driver.findElement(By.xpath("//label[contains(text(),'Male')]")).click();
		    driver.findElement(By.id("userNumber")).sendKeys("7780401477");
		    
		    driver.findElement(By.id("dateOfBirthInput")).click();
		    String month="September 1995";
		    while(true) {
		    	String text=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[1]")).getText();
		    	//System.out.println(text);
		    	if(text.equalsIgnoreCase(month)) {
		    		break;
		    	}else {
		    		driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/button[1]")).click();/// previous arrow button
		    	}
		    	
		    	
		    }
	       
		   
		    driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]")).click();/// date path for sept 1995
		    driver.findElement(By.cssSelector("textarea#currentAddress")).sendKeys("Telugu");
		  //  driver.findElement(By.id("submit")).click();

	}

}
