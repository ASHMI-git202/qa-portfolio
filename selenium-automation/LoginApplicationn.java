package seleniumCodes;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginApplicationn {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();	
		driver.manage().window().maximize();
		driver.get("https://demoblaze.com");
		Thread.sleep(Duration.ofSeconds(10));
		WebElement navbar_login, uname_box, pwd_box, login_button;
		navbar_login = driver.findElement(By.id("login2"));
		navbar_login.click();
		Thread.sleep(Duration.ofSeconds(10));
		uname_box = driver.findElement(By.id("loginusername"));
		uname_box.sendKeys("ashmi@1234");
		pwd_box = driver.findElement(By.id("loginpassword"));
		pwd_box.sendKeys("ashmi123");
		Thread.sleep(Duration.ofSeconds(10));
        login_button = driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]"));
        login_button.click();
		driver.quit();
		}


}
