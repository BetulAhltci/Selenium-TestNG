package unitilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    /*Daha fazl kontrol imkanı ve extends kullanmadan driver'a ulasmak için
    WebDriver objesini driver class'ındaki static bir method ile olusturacagız

    Ancak getDriver() methodu her cagrıldıgında yeni bir driver olusturur
    Bunu engellemek ve codun duzgun calısması için ilk kullanımda "new ChromeDriver()" calıssın
    sonrakı kullanımlarda calısmasın diye bir yontem gelistirmeliyiz

    */
    private Driver(){}
    public static WebDriver driver;

    public static WebDriver getDriver() {

        String istenenBrowser=ConfigReader.getProperty("browser");

        if (driver == null) {

            switch (istenenBrowser){
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }


        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }


    }
}
