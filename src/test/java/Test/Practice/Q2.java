package Test.Practice;

import org.testng.annotations.Test;
import unitilites.ConfigReader;
import unitilites.Driver;

public class Q2 {

    /*
    - Birbirine bagimli testler olusturun.
    - ConfigReader ile Birbirine bagimli testler olusturarak ;
        =>ilk once wisequarter'a gidin
        =>sonra facebook'a bagimli olarak youtube'a gidin
        =>daha sonra youtube'a bagimli olarak amazon'a gidin
    - driver'i kapatin.
     */

    @Test
    public void wisequarter(){
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));

    }
    @Test(dependsOnMethods = "wisequarter")
    public void youtube(){
        Driver.getDriver().get(ConfigReader.getProperty("youtubeUrl"));
    }
    @Test(dependsOnMethods = "youtube")
    public void amazon(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }


}
