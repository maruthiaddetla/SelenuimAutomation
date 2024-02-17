import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate {

    public static void main(String args[]){


        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.spark.co.nz/");
    }
}
