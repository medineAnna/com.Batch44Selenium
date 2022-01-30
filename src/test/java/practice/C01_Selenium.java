package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Selenium {
    public static void main(String[] args) {

       // ...Exercise5...
         System.setProperty("webdriver.chrome.driver","src/driver/chromedriver.exe");
         WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

       // Navigate to website  https://testpages.herokuapp.com/styled/index.html
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");

       // Under the  ORIGINAL CONTENTS
       // click on Alerts
        WebElement alertsClick=driver.findElement(By.xpath("//a[@id='alert']"));
        alertsClick.click();

       // print the URL
        String alertURL=driver.getCurrentUrl();
        System.out.println("Alert URL: " + alertURL);

       // navigate back
        driver.navigate().back();

       // print the URL
        String homeURL=driver.getCurrentUrl();
        System.out.println("Home URL: " + homeURL);

       // Click on Basic Ajax
        WebElement basicAjex=driver.findElement(By.id("basicajax"));
        basicAjex.click();

       // print the URL
        String basicURL=driver.getCurrentUrl();
        System.out.println("Basic Ajax URL: " + basicURL);

       // enter value-> 20 and Enter
        driver.findElement(By.id("lteq30")).sendKeys("20" + Keys.ENTER);

       // and then verify Submitted Values is displayed open page
        boolean verify=driver.findElement(By.xpath("//p[text()='Submitted Values']")).isDisplayed();
        System.out.println(verify ? "Pass" : "Fail");

       // close driver
        driver.close();

    }
}
