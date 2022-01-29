package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_day02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver");
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com/");

        System.out.println(driver.getTitle());

        String actualAmazon=driver.getTitle();
        String expectedAmazon="Amazon";

        if(actualAmazon.contains(expectedAmazon)){
            System.out.println("Baslik testi PASS");
        }else{
            System.out.println("Baslik testi FAILED");
        }

        String actualURL=driver.getCurrentUrl();
        String expectedURL="amazon";

        if(actualURL.contains(expectedURL)){
            System.out.println("Amazon URL PASS");
        }else{
            System.out.println("Amzon URL FAILED");
        }
        System.out.println(driver.getWindowHandle());

        String actualHtml=driver.getPageSource();
        String expectedHtml="alisveris";

        if(actualHtml.contains(expectedHtml)){
            System.out.println("HTML PASS");
        }else{
            System.out.println("HTML Failed");
        }
    }
}
