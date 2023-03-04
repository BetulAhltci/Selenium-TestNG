package Test.day11_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C04_HardAssert_SoftAssert {

    @Test
    public void hardAssertionTesti(){
        Assert.assertTrue(5>8);
        Assert.assertFalse(8==8);
        Assert.assertEquals(5,9);
        Assert.assertNotEquals(6,6);
    }
    @Test
    public void softAssertionTesti(){
        /*
        Junit deki Assert class'ı TestNG dede vardır.
        Ancak bir test metodunda birden fazla faild olan assertion varsa
        ilk faild olan assertion'da calısmayı durdurup exception firlattıgımdan,
        tum hatayı bir defada görup hepsini düzeltme sansımız olmaz

        TestNG bunun için bir alternatif olusturmuz
        Bu alternatifte Assert class'ındaki static metodları kullanmak yerine

        SoftAssert clas'ından bir obje olusturup o obje uzerinden istediğimiz testleri yapiyoruz

        ancak testlerin sonucunu gormek idtediğimizde softassert.assertall()ile yaptıgımız tüm testlri
        raporlamasını soyleyerek
         */

        SoftAssert softAssert=new SoftAssert();

        softAssert.assertTrue(5>8,"True testi faild");
        softAssert.assertFalse(8==8,"False testi faild");
        softAssert.assertEquals(5,9,"Equals testi faild");
        softAssert.assertNotEquals(6,6,"NotEquals testi faild");

        softAssert.assertAll();


    }
}
