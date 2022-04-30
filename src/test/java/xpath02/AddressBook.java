package xpath02;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Random;

public class AddressBook {
    public static void main(String[] args) {
        //Open a Chrome browser
        //Go to http://a.testaddressbook.com/sign_in
        //array = ['a', 'b']
        //Enter email using random of element of array adding b+@gmail.com at the end
        //Enter a dummy password
        //Click on sign in button
        //Verify message dispalyed “Bad email or password.
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://a.testaddressbook.com/sign_in");
        String [] email = {"tony", "max","andrew", "kamol"};
        String emailEnd = "@gmail.com";
        Random random = new Random();
        int ran = random.nextInt(email.length-1);

        WebElement login=driver.findElement(By.xpath("//input[@id=\"session_email\"]"));
        WebElement pass=driver.findElement(By.xpath("//input[@id=\"session_password\"]"));
        WebElement signBtn= driver.findElement(By.xpath("//input[@data-test=\"submit\"]"));
        login.sendKeys(email[ran] + emailEnd);
        pass.sendKeys("123456");
        signBtn.click();



    }
}
