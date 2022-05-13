import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class FirstTests extends BaseUtils {
    WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void Base() {
        driver.get("https://demoqa.com/automation-practice-form");
        //driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
    }

    @Test
    public void GeneralTests() {

        driver.findElement(By.className("Practice Form")).click();
//        driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//        driver.get("https://demoqa.com/automation-practice-form");
//        WebElement myDynamicElement = driver.findElement(By.className("Practice Form"));
    }

    @Test
    public void inputFirstNameField() throws InterruptedException {
        driver.findElement(By.id("firstName")).sendKeys("It is MyName");
        //driver.manage().timeouts().implicitlyWait(500, TimeUnit.MILLISECONDS);
    }

    @Test
    public void inputLastNameField() {
        driver.findElement(By.id("lastName")).sendKeys("It is MySurname");
        //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        //Thread.sleep(2500);
    }

    @Test
    public void humanGender() throws InterruptedException {
        driver.findElement(new By.ByCssSelector("#genterWrapper > div.col-md-9.col-sm-12 > div:nth-child(2)")).click();
        Thread.sleep(2500);
        //driver.findElement(new By.ByCssSelector("#genterWrapper div.custom-control.custom-radio.custom-control-inline label")).click();
        //driver.findElement(By.id("gender-radio-2 label")).click();

        //driver.findElement(new By.ByCssSelector("#genterWrapper div.custom-control.custom-radio.custom-control-inline female")).click();
        //driver.findElement(By.cssSelector("input[id='gender-radio-2']")).click();

        /*WebElement radioElement = driver.findElement(By.id("gender-radio-2"));
        boolean selectState = radioElement.isDisplayed();

//performing click operation only if element is not selected
        if (selectState == false) {
            radioElement.click();
                 }
         */
    }

    @Test
    public void clearDateOfBirth() throws InterruptedException {
        //driver.findElement(By.className("form-control")).click();

        driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.CLEAR);
        Thread.sleep(2500);
        driver.findElement(By.id("dateOfBirthInput")).sendKeys(Keys.ARROW_UP);
        //driver.findElement(By.id("dateOfBirthInput")).sendKeys("08 May 2022");
        Thread.sleep(2500);
        driver.findElement(By.id("dateOfBirthInput"));
        //driver.manage().wait(200, 10);
        //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
        /*try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

         */

//
//
//        driver.findElement(By.id("dateOfBirthInput")).clear();
    }

    @AfterClass
    void close() {
        driver.close();
    }
}

//    WebElement month = driver.findElement(By.cssSelector("select.react-datepicker__month-select"));
//    Select selectMonth = new Select(month);
//        selectMonth.selectByVisibleText("March");





