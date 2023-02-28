package unitilites;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    /*Daha fazl kontrol imkanı ve extends kullanmadan driver'a ulasmak için
    WebDriver objesini driver class'ındaki static bir method ile olusturacagız

    Ancak getDriver() methodu her cagrıldıgında yeni bir driver olusturur
    Bunu engellemek ve codun duzgun calısması için ilk kullanımda "new ChromeDriver()" calıssın
    sonrakı kullanımlarda calısmasın diye bir yontem gelistirmeliyiz
*/
    public static WebDriver driver;

    public static WebDriver getDriver() {
        WebDriverManager.chromedriver().setup();


        if (driver == null) {
            driver = new ChromeDriver();
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
