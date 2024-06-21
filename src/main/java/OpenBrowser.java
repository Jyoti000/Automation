import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class OpenBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\daffolap-910\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
       //driver.get("https://www.google.com");
       driver.get("https://sjk-staging.clientela.com/user/login");
       
       WebElement username = driver.findElement(By.xpath("//*[@id='edit-name']"));
       username.sendKeys("testws");
       Thread.sleep(2000);
       
       WebElement password = driver.findElement(By.xpath("//*[@id='edit-pass']"));
       password.sendKeys("QY-;Lt5DCH3~g#^Aw");
       Thread.sleep(2000);
       
       WebElement button = driver.findElement(By.xpath("//button[@id='edit-submit']"));
       button.click();
     	System.out.println("Clicked on the login button");


     
       
       
	}

}
