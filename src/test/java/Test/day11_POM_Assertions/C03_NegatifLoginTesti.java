package Test.day11_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QdPage;
import unitilites.ConfigReader;
import unitilites.Driver;

public class C03_NegatifLoginTesti {

    // qd anasayfaya gidin
    // 3 test method'u olusturun ve
    // asagidaki durumlarda giris yapilamadigini test edin
    // 1- gecerli username, gecersiz password
    // 2- gecersiz username, gecerli password
    // 3- gecersiz username, gecersiz password

    QdPage qdPage=new QdPage();

@Test
public void negatifLogin1(){
    qdPage=new QdPage();
    Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
    qdPage.ilkLoginLinli.click();
    qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecerliUsername"));
    qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPasword"));
    qdPage.loginButton.click();
    Assert.assertTrue(qdPage.emailKutusu.isEnabled());
}
    @Test(groups = {"smoke","mr1"})
    public void negatifLogin2(){
    qdPage=new QdPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qdPage.ilkLoginLinli.click();
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecerlizPasword"));
        qdPage.loginButton.click();
        Assert.assertTrue(qdPage.emailKutusu.isEnabled());
    }
    @Test
    public void negatifLogin3(){
    qdPage=new QdPage();
        Driver.getDriver().get(ConfigReader.getProperty("qdUrl"));
        qdPage.ilkLoginLinli.click();
        qdPage.emailKutusu.sendKeys(ConfigReader.getProperty("qdGecersizUsername"));
        qdPage.passwordKutusu.sendKeys(ConfigReader.getProperty("qdGecersizPasword"));
        qdPage.loginButton.click();
        Assert.assertTrue(qdPage.emailKutusu.isEnabled());
    }
}
