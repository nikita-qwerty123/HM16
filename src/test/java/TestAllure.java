import configuretions.BaseClass;
import liseners.MyLisener;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import util.Screen;

@Listeners(MyLisener.class)
public class TestAllure extends BaseClass {

    @BeforeClass
    public void startTest() {driver.get("https://docs.qameta.io/allure-report/");}

    @Test (description = "ScreenShot")
    public void test1() {
        Screen.takeScreen(driver,"screenshot");
    }

    @Test (description = "getCurrentUrl")
    public void test2() {
        System.out.println(driver.getCurrentUrl());
    }

    @Test (description = "getTitle")
    public void test3(){
        System.out.println(driver.getTitle());
    }
    @Test (description = "getText")
    public void test4(){
        System.out.println(driver.findElement(By.xpath("//h2[@id='_get_started']")).getText());
    }
    @Test (description = "justHelloWorld")
    public void test5() {
        System.out.println("Hell0 w0rld!");
    }



}
