package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethod {
    public static void main(String[] args) {
     /* 1. Yeni bir package olusturalim : day01
        2. Yeni bir class olusturalim : C01_GetMethods */

        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver");

        WebDriver driver=new ChromeDriver();
        // 3. Amazon sayfasina gidelim. https://www.amazon.com/
        driver.get("https://www.amazon.com");

        // 4. Sayfa basligini(title) yazdirin
        System.out.println(driver.getTitle());

        // 5. Sayfa basliginin “Amazon” icerdigini test edin
        String actualTitle=driver.getTitle();
        String arananKelime="Amazon";

        if (actualTitle.contains(arananKelime)){
            System.out.println("Title test PASS");
        }else{
            System.out.println("Title testi FAILED");
        }
        //6. Sayfa adresini(url) yazdirin
        String actualUrl=driver.getCurrentUrl();
        String arananKelime1="amazon";

        if(actualUrl.contains(arananKelime1)){
            System.out.println("URL testi PASS");
        }else{
            System.out.println("URL testi FAILED");
        }

       // 8. Sayfa handle degerini yazdirin
        System.out.println(driver.getWindowHandle());

       // 9. Sayfa HTML kodlarinda “alisveris” kelimesi gectigini test edin
        String actualPageSource=driver.getPageSource();
        String pageAranankelime="alisveris";

        if(actualPageSource.contains(pageAranankelime)){
            System.out.println("URL testi PASS");
        }else{
            System.out.println("URL testi FAILED");
        }
        //10. Sayfayi kapatin.
        driver.close();
    }
}
