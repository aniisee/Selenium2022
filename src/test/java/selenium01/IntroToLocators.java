package selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntroToLocators {
    public static void main(String[] args) {
        //Loacators Intro:
        // How do we locate a Webelement with selenium?
        // findElement()-->this method will return a single webElement
        // driver.findElement(LOCATOR)
         //There are 8 types of locators:

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElement(By.linkText("About")).click();

        String actualTitle=driver.getTitle();
        String expectedTitle="About";

        if(actualTitle.contains(expectedTitle)){
            System.out.println("The test passed");
        }else{
            System.out.println("Test case fail");
        }


}
}

