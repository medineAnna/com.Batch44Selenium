package day04_XpathCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_TekrarTesti {
    public static void main(String[] args) {

       /*
        d. “Shopping” e tıklayın.
        .*/

                System.setProperty("webdriver.chrome.driver","src/driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // amazon web sayfasına gidin. https://www. amazon.com/
        driver.get("https://www.amazon.com/");

        // b. Search(ara) “city bike” yazip arattirin
        WebElement arananKutu=driver.findElement(By.id("Twotabsearchtextbox"));
        arananKutu.sendKeys("city bike" + Keys.ENTER);
        //arananKutu.submit();

        //c. Amazon'da görüntülenen ilgili sonuçların sayısını yazdırın
        List<WebElement> sonucYazisiElementi=driver.findElements(By.className("sg-cool-inner"));
        System.out.println(sonucYazisiElementi.size());

        //e. Sonra karşınıza çıkan ilk sonucun resmine tıklayın
        WebElement ilkUrunResmi=driver.findElement(By.className("s-image"));
        ilkUrunResmi.click();

        //sadece click yapmak gibi basit bir islemde kullanacagimiz web elementler icin
        //veriable olusturmadan direk Locate edip istedigimiz islemi yapabilirz
    }
}
