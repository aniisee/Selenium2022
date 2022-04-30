package selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumPractice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup(); // this line creates connection between driver and selenium
        //and set up the driver

        WebDriver driver=new ChromeDriver(); // we create instance of ChromeDriver
        driver.get("https://www.amazon.com/"); //It will navigate to the http address
        System.out.println(driver.getTitle());

        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().to("https://www.etsy.com");//this is similar to driver.get()
// but not waiting for page to load
        System.out.println(driver.getTitle());
        driver.close(); //it will close the browser



    }
}
