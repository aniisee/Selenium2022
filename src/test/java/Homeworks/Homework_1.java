package Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework_1 {
    public static void main(String[] args) {
        //Open Chrome browser
        //2. Go to https://the-internet.herokuapp.com/add_remove_elements/
        //3. Click to “Add Element” button
        //4. Verify “Delete” button is displayed after clicking.
        //5. Click to “Delete” button.
        //6. Verify “Delete” button is NOT displayed after clicking.
        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
        WebElement addElement=driver.findElement(By.xpath("//*[@id=\"content\"]/div/button"));
        addElement.click();
        WebElement deleteButton=driver.findElement(By.xpath("//*[@id=\"elements\"]/button"));
        if (deleteButton.isDisplayed()){
            System.out.println("Button is displayed!");
        }
        else {
            System.out.println("Button is NOT displayed");
        }
        deleteButton.click();


        if(!deleteButton.isDisplayed()){
            System.out.println("Test Pass");
        }else{
            System.out.println("Test Fail");

        }

        }

    }

