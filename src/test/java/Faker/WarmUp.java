package Faker;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Faker faker=new Faker();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstName']"));
        firstName.sendKeys("Najmuddin");
        WebElement lastName=driver.findElement(By.xpath("//input[@name='lastName']"));
        lastName.sendKeys("Khalifaev");
        WebElement phone=driver.findElement(By.xpath("//input[@name='phone']"));


    }
}
