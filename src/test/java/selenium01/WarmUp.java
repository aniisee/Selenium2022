package selenium01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WarmUp {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com");

        String actualTitle=driver.getTitle();
        String expectedTitle="Google";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("The title test pass");
        }else{
            System.out.println("Title test failed");
        }
        //Task#2

        driver.get("https://www.technovaschool.com");
        String actualURL=driver.getCurrentUrl();
        String expected="technovaschool";
        if(actualURL.contains(expected)){
            System.out.println("Second test pass");
        }else{
            System.out.println("Second test failed");
        }



    }
}
