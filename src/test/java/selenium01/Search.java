package selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("apple"+Keys.ENTER);
        String actualTitle=driver.getTitle();
        String expectedTitle="apple";
        if(actualTitle.contains(expectedTitle)){
            System.out.println("The title test is passed");
        }else{
            System.out.println("The tittle test is failed");
        }

    }
}
