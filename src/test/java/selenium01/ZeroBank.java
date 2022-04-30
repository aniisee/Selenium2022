package selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ZeroBank {
    public static void main(String[] args) {
        //Task #7 --> Zero Bank header verification
        //1. Open a Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html
        //3. Check header textExpected --> "Log in to ZeroBank"
        //4. Close the session.
        //1. Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        //3. Check header textExpected --> "Log in to ZeroBank"
        driver.findElement(By.tagName("h3")).getText();
        if(driver.findElement(By.tagName("h3")).getText().equals("Log in to ZeroBank")){
            System.out.println("test pass");
        }else{
            System.out.println("test fail");
        }
        //4. Close the session
        driver.close();
    }
}
