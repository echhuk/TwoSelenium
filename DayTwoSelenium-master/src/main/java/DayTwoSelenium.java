import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayTwoSelenium {
    public static void main(String[] args) {
//Homework for DayOne
        WebDriverManager.chromedriver().setup();
        WebDriver driver =  new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        WebElement webElement = driver.findElement(By.cssSelector("[name='q']"));

        String s_serach = "smartwatch";
        webElement.sendKeys(s_serach);
        webElement.sendKeys(Keys.ENTER);

        //driver.quit();


    }
}