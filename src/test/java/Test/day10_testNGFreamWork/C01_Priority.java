package Test.day10_testNGFreamWork;

import org.testng.Assert;
import org.testng.annotations.Test;
import unitilites.Driver;

public class C01_Priority {

    /*
    TestNg test methodlatını calıstırırken standart olarak harf sıralamasına bakar
    Ancak TestNg sıralamayı bizim kontrol etmemize olanak verir

    İstediğimiz test metoduna istediğimiz önceliği priority ile tanımlayabiliriz
    Selenıum test metodlarını prpority'si kucukten buyuge olacak sekilde calıstırır

    Priority degeri aynı olan testler harf sırasına göre calısır

    Priority degeri yazılmazsa default olarak 0 kabul edilir

    - deger verilirse de önceo deger calısır
     */

    @Test(priority = 20)
    public void amazonTesti(){
        //amazon ana sayfaya gidip,amazona gittigimizi test edelim
        Driver.getDriver().get("https://www.amazon.com");
        //url amazon içeriyormu
        String expectedIcerik="amazon";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));
    }
    @Test(priority = 15)
    public void wiseTesti(){
        //wiswquarter ana sayfaya gidip.ana sayfaya gittiğimizi test edelim
        Driver.getDriver().get("https://www.wisequarter.com");
        //url amazon içeriyormu
        String expectedIcerik="wisequarter";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));
    }
    @Test(priority = 10)
    public void youtubeTesti(){
        //youtube anasayfaya gidelim,gittigimizi test edelim
        Driver.getDriver().get("https://www.youtube.com");
        //url amazon içeriyormu
        String expectedIcerik="youtube";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedIcerik));
    }
}
