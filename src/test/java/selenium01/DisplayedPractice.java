package selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisplayedPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        boolean header;

        header=driver.findElement(By.tagName("h3")).isDisplayed();
        if(header){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Fail");
        }

    }
}
