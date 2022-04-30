package selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp3 {
    public static void main(String[] args) {
        //Task# 3
        //1. Open a Chrome browser
        //2. GO to https://google.com
        //3. Click Gmail from top right
        //4. Verify it contains Expected Gmail
        //5. Go back to Google by using back() command
        //6. Verify title contains "Google"
        //7. Go back to Gmail using forward button
        //8. Verify title contains Expected Gmail

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
        driver.findElement(By.linkText("Gmail")).click();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Gmail";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
        driver.navigate().back();
        String actualTitle2 = driver.getTitle();
        String expectedTitle2 = "Google";
        if(actualTitle2.contains(expectedTitle2)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
        driver.navigate().forward();
        if(actualTitle.contains(expectedTitle)){
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }
}
