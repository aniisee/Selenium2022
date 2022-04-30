package selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTAsk {
    public static void main(String[] args) {
        //1. Open a chrome browser
        //2. Go to amazon.com
        //3. Enter any search term
        //4. Click on search button
        //5. Verify title

        //1. Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to amazon.com
        driver.get("http://amazon.com");
        String searchTerm ="java book";
        //3. Enter any search term
        driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("java book"+ Keys.ENTER);
        //4. Click on search button
        driver.findElement(By.cssSelector("input[id='nav-search-submit-button']")).click();
        //5. Verify title
        String actualValue = driver.getTitle();
        if(actualValue.contains(searchTerm)){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Fail!");
        }
    }
}
