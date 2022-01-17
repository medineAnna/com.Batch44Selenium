package day02_driverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Tekrar {
    //Normalde selenium'un kendi IDE'si de var fakat biz daha kullanisli oldugu icin Intellij kullaniyoruz
    //Intellij'de yeni proje actigimizda oncelikle selenium kutuphanelerini projeye eklememiz gerekir
    //biz en ilkel haliyle projemize kutuphaneleri jar dosyalari olarak yukledik
    //bu ekledigimiz dosyalarla artik driver'in ayarlarini yapabiliriz

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver");

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.amazon.com");

        Thread.sleep(5000);
//icine yazilan milllisaniye kadar kodlarin calismasini
        driver.close();
    }
}
