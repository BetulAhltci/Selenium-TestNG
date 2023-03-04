package Test.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import unitilites.ConfigReader;
import unitilites.Driver;

public class Q3 {
/* * Navigate to https://www.saucedemo.com/
            * Enter the username as standard_user
     * Enter the password as secret_sauce
     * Click on login button
     *    Test1 : Choose price low to high
     *    Test2 : Verify item prices are sorted from low to high with soft Assert
     */

@Test
    public void soucedemoTest(){
    Driver.getDriver().get(ConfigReader.getProperty("saucedemoUrl"));
    Driver.getDriver().findElement(By.id("user-name")).sendKeys("standard_user");
    Driver.getDriver().findElement(By.id("password")).sendKeys("secret_sauce");
    Driver.getDriver().findElement(By.id("login-button")).click();

    WebElement dropdown=Driver.getDriver().findElement(By.className("product_sort_container"));
    Select select=new Select(dropdown);
    select.selectByIndex(2);

    SoftAssert softAssert=new SoftAssert();
    String expected ="Price (low to high)";



}









}
