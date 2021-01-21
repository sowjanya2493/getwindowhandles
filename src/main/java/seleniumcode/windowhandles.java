package seleniumcode;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sk\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		String parent=driver.getWindowHandle();
		System.out.println(parent);

		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Set<String> s1=driver.getWindowHandles();
		System.out.println(s1);
		
		int wincount=s1.size();
		System.out.println(wincount);
		for(String child:s1) {
			if(!parent.equalsIgnoreCase(child)) {
				driver.switchTo().window(child);
				driver.findElement(By.name("emailid")).sendKeys("sowjanyageddada6@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				
					
			}
		}
		
			driver.switchTo().window(parent);
		
	}

}
