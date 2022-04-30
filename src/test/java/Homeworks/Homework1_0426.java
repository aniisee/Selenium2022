package Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homework1_0426 {
    public static void main(String[] args) {
        //1. Open a Chrome browser
        //2. Go to https://www.rahulshettyacademy.com/AutomationPractice/
        //under ---Checkbox Example
        //3.Select all 3 options (one by one)
        //4. Verify all 3 options are selected
        //5. Unselect second option
        //6. Verify second option is not selected anymore

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        WebElement option1=driver.findElement(By.xpath("//*[@id=\"checkBoxOption1\"]"));
        option1.click();
        WebElement option2=driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]"));
        option2.click();
        WebElement option3=driver.findElement(By.xpath("//*[@id=\"checkBoxOption3\"]"));
        option3.click();
        if (option1.isSelected()){
            System.out.println("Option 1 is selected!");
        }else{
            System.out.println("Option 1 was NOT selected!");
        }
        if(option2.isSelected()){
            System.out.println("Option 2 is selected");
        }else{
            System.out.println("Option 2 was NOT selected!");
        }
        if(option3.isSelected()){
            System.out.println("Option 3 is selected");
        }else{
            System.out.println("Option 3 was NOT selected!");
        }
        WebElement unselect=driver.findElement(By.xpath("//*[@id=\"checkBoxOption2\"]"));
        unselect.click();
        if(!unselect.isSelected()){
            System.out.println("Option 2 was unselected!");
        }else{
            System.out.println("Option 2 is STILL SELECTED!!!");
        }

    }
}
