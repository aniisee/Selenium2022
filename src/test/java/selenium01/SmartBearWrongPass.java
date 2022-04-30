package selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SmartBearWrongPass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(" http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        driver.findElement(By.name("ctl00$MAinContent$username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MAinContent$password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
      //  driver.findElement(By.id("ctl00_MainContent_status")).getText();
        String actualValue=driver.findElement(By.id("ctl00_MainContent_status")).getText();
        String expectedValue="Invalid Login or Password.";
        if(actualValue.equals(expectedValue)){
            System.out.println("test pass");
        }else{
            System.out.println("test fail");
        }
    }
}
