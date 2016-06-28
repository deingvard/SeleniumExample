import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

/**
 * Created by igor on 27.06.16.
 */
public class LoginPage {

    public WebDriver driver;

    @Test
    public void main() {
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("username")).sendKeys("i.ivliev");
        driver.findElement(By.id("password")).sendKeys("123456");
        driver.findElement(By.id("SubmitCreds")).click();
        System.out.println("Successfully");

    }

    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://webmail.itransition.com");

    }

    @AfterMethod
    public void afterMethod() {
        driver.quit();
    }

}