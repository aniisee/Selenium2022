package Homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Homework2_0426 {
    public static void main(String[] args) {
        //  1.Open chrome browser
        //	2. Go to https://demo.applitools.com/app.html
        //	3. Get amount of total balance, credit available, due today
        //	4. Add (sum_ all three amounts)
        //	5. Print out the result
        //	6.close the driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://demo.applitools.com/app.html");
        WebElement totalBalance = driver.findElement(By.xpath("//div[@class=\"balance-hidden-value\"]/span[1]"));
        WebElement creditAvailabile = driver.findElement(By.xpath("//div[@class=\"balance\"]/div[@class=\"balance-value\"]"));
        WebElement dangerValue = driver.findElement(By.xpath("//div[@class=\"balance\"]/div[@class=\"balance-value danger\"]"));
        String numTwoString=creditAvailabile.getText().replace("$","");

        int numOne=Integer.valueOf(totalBalance.getText().replace("$",""));
        int numTwo=Integer.valueOf(creditAvailabile.getText().replace("$",""));
        int numThree=Integer.valueOf(dangerValue.getText().replace("$",""));
        int total=numOne+numTwo+numThree;
        System.out.println(total);
    }
}
