package Test.day12_xmlFiles;

import org.testng.annotations.Test;

public class C01DriverSinletonPattern {
    @Test
    public void test01(){
        /*
        POM webDriver olarak Driver class'ındaki getDriver() metodunun kullanilmasi uzerine kurgulanmistır
        driver.getDriver()

        Driver class'ının obje olusturularak kullanilmasini engellemek için
        POM u tasarlyanlr bir onlem almak istemisler

        Java'da bir class'dan obje olusturulmasini engellemek isterseniz SINGLETON PATERN kullanılır

        Singleton patern bir class'dan obje olusturulmasını engellemekveya sinirlamak için
        kullanılan bir yontemdir. Temel fikir;obje olusturmak için olusturulan default constructoryerine
        gorunur parametresiz bir contructor olusturup bu contructorun accsess modifire'ını private yapıp
        kullanilmasini engellemektir

         */
    }
}
