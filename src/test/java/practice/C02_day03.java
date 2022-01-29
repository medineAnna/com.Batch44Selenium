package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_day03 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/driver/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //1. Bir class oluşturun: LoginTest
        //2. Main method oluşturun ve aşağıdaki görevi tamamlayın.
        //a. http://a.testaddressbook.com adresine gidiniz.
        driver.get("http://a.testaddressbook.com");

        //b. Sign in butonuna basin
        WebElement signInButton=driver.findElement(By.id("sign-in"));
        signInButton.click();

        //c. email textbox,password textbox, and signin button elementlerini locate ediniz..
        WebElement emailTextBox=driver.findElement(By.id("session_email"));
        WebElement passwordText=driver.findElement(By.id("session_password"));
        WebElement signInTextBox=driver.findElement(By.name("commit"));

        //d. Kullanıcı adını ve şifreyi aşağıya girin ve oturum aç (sign in)buttonunu tıklayın:
        //i. Username : testtechproed@gmail.com
        //ii. Password : Test1234!
        emailTextBox.sendKeys("testtechproed@gmail.com");
        passwordText.sendKeys("Test1234!");
        signInTextBox.click();

        //e. Expected giris sayfanin 'Welcome to Adress Book' oldugunu dogrulayin(verify).
        WebElement girisElement=driver.findElement(By.tagName("h1"));
        System.out.println(girisElement.getText());
        String actualGirisiElement=girisElement.getText();
        String expectedGirisYazi="Welcome to Address Book";

        if(actualGirisiElement.equals(expectedGirisYazi)){
            System.out.println("Girisi yazi Pass");
        }else{
            System.out.println("Girisi yazi Failed");
        }

        //f. “Addresses” ve “Sign Out” textlerinin görüntülendiğini( displayed) doğrulayin(verify).
        WebElement adressesKontrol= driver.findElement(By.linkText("Adresses"));
        WebElement signInKontrol=driver.findElement(By.linkText("Sign out"));

        if(adressesKontrol.isDisplayed()){
            System.out.println("Adresses Element Pass");
        }else{
            System.out.println("Adresses Element Failed");
        }

        if(signInKontrol.isDisplayed()){
            System.out.println("Sig In Element Pass");
        }else{
            System.out.println("Sig In Element Failed");
        }

        //3. Sayfada kac tane link oldugunu bulun.
        List<WebElement> linkSayisi=driver.findElements(By.tagName("a"));
        System.out.println("sayfada " + linkSayisi.size() + " adet Link bulunmkatadir");
    }
}
