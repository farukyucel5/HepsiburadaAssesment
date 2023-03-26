package pages;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ReuseableMethods;

import java.time.Duration;
import java.util.List;

public class HepsiburadaPage {
    AppiumDriver driver;
    WebDriverWait wait;
    ReuseableMethods reuseableMethods;
    By kategorilerbutonu = AppiumBy.xpath("(//android.widget.ImageView[@resource-id='com.pozitron.hepsiburada:id/navigation_bar_item_icon_view'])[2]");
    By encokBakilanlar= AppiumBy.id("com.pozitron.hepsiburada:id/textViewTitle");
    By sporOutdoor = AppiumBy.androidUIAutomator("new UiSelector().text(\"Spor, Outdoor\")");
    By outdoorBot = AppiumBy.androidUIAutomator("new UiSelector().text(\"Outdoor Bot\")");

    By cinsiyet = AppiumBy.androidUIAutomator("new UiSelector().text(\"Cinsiyet\")");
    By erkek = AppiumBy.androidUIAutomator("new UiSelector().text(\"Erkek\")");
    By fiyatAraligi = AppiumBy.androidUIAutomator("new UiSelector().text(\"Fiyat Aralığı\")");
    By ourdoorGiyimAyakkabi = AppiumBy.androidUIAutomator("new UiSelector().text(\"Outdoor Giyim - Ayakkabı\")");
    By slazengerHabibErkekBot = AppiumBy.androidUIAutomator("new UiSelector().text(\"Slazenger Habıb Erkek Outdoor Bot\")");
    By minPrice = AppiumBy.id("com.pozitron.hepsiburada:id/editTextPriceMin");
    By maxPrice = AppiumBy.id("com.pozitron.hepsiburada:id/editTextPriceMax");

    By uygulaButonu = AppiumBy.id("com.pozitron.hepsiburada:id/btnFiltersApply");
    By uygula = AppiumBy.id("com.pozitron.hepsiburada:id/btn_filters_apply");
    By urunleriGor=AppiumBy.id("com.pozitron.hepsiburada:id/btn_filters_main_close");


    By sepeteEkle = AppiumBy.androidUIAutomator("new UiSelector().text(\"Sepete ekle\")");
    By sepeteGit = AppiumBy.androidUIAutomator("new UiSelector().text(\"Sepete git\")");
    By alisverisiTamamla = AppiumBy.androidUIAutomator("new UiSelector().text(\"Alışverişi tamamla\")");

    By filtrele = AppiumBy.androidUIAutomator("new UiSelector().text(\"Filtrele\")");

    //============================Background=====================================\\

    By hesabimIkonu=AppiumBy.accessibilityId("Hesabım");
    By girisYap= AppiumBy.androidUIAutomator("new UiSelector().text(\"Giriş yap\")");
    By loginGiris =AppiumBy.xpath("//android.widget.Button[@text='Giriş yap']");
    By emailBox = AppiumBy.className("android.widget.EditText");
    By passwordBox = AppiumBy.xpath("//android.widget.EditText[@resource-id='txtPassword']");
    By tamamButonu= AppiumBy.id("android:id/button1");
    By hesabimEkraniniKapatButonu=AppiumBy.accessibilityId("Hesabım ekranını kapat");


    //odeme sayfası
    By kartNo = AppiumBy.xpath("(//android.view.View[@resource-id='paymentOptions']//android.widget.EditText)[1]");
    By kartUzerindekiIsim=AppiumBy.xpath("(//android.view.View[@resource-id='paymentOptions']//android.widget.EditText)[2]");
    By sonKullanmaTarihi =AppiumBy.xpath("(//android.view.View[@resource-id='paymentOptions']//android.widget.EditText)[3]");
    By cvc=AppiumBy.xpath("(//android.view.View[@resource-id='paymentOptions']//android.widget.EditText)[4]");



    public HepsiburadaPage(AppiumDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.reuseableMethods = new ReuseableMethods(driver);
    }

    public void kategoriTiklama() {
        reuseableMethods.findingElement(kategorilerbutonu).click();
        reuseableMethods.findingElement(encokBakilanlar).click();
    }
    public void istenenKategoriAramaVeTiklama(String kategori) {
       if (kategori.equals("Spor outdoor kategorisi"))
           reuseableMethods.scrollToAndClickOn("Spor, Outdoor",sporOutdoor);
       if (kategori.equals("Outdoor Bot"))
           reuseableMethods.scrollToAndClickOn("Outdoor Ayakkabı",outdoorBot);

    }
    public void setOurdoorGiyimAyakkabi(){
        reuseableMethods.findingElement(ourdoorGiyimAyakkabi).click();
    }

    public void clickingOnElement(String kategori){
        if (kategori.equals("fiyat araligi"))
            reuseableMethods.findingElement(fiyatAraligi).click();
        if (kategori.equals("uygula butonu"))
            reuseableMethods.findingElement(uygulaButonu).click();
        if (kategori.equals("cinsiyet")){
            reuseableMethods.findingElement(cinsiyet).click();
            driver.findElement(erkek).click();
            driver.findElement(uygula).click();
        }
        if (kategori.equals("sepete ekle"))
            reuseableMethods.findingElement(sepeteEkle).click();

        if (kategori.equals("slazenger Habib Erkek Outdoor Bot")){
          reuseableMethods.findingElement(slazengerHabibErkekBot).click();
        }
        if (kategori.equals("filtrele"))
            reuseableMethods.findingElement(filtrele).click();
        if (kategori.equals("urunleri gor"))
            reuseableMethods.findingElement(urunleriGor).click();
        if (kategori.equals("sepete git"))
            reuseableMethods.findingElement(sepeteGit).click();
        if (kategori.equals("alisverisi tamamla"))
            reuseableMethods.findingElement(alisverisiTamamla).click();
        if (kategori.equals("Hesabim ikonuna")){
            reuseableMethods.findingElement(hesabimIkonu).click();
            reuseableMethods.findingElement(girisYap).click();
        }
        if (kategori.equals("giris yap")){
            reuseableMethods.findingElement(girisYap).click();
        }
        if (kategori.equals("tamam"))
            reuseableMethods.findingElement(tamamButonu).click();
        if (kategori.equals("carpi simgesi"))
            reuseableMethods.findingElement(hesabimEkraniniKapatButonu).click();
        if (kategori.equals("login giris yap"))
            reuseableMethods.findingElement(loginGiris).click();
    }
    public void enteringInputIntoTextBox(String input){
        if (input.equals("En az fiyat")){
            reuseableMethods.findingElement(minPrice).click();
            driver.findElement(minPrice).sendKeys("500");
        }
        if (input.equals("En cok fiyat")){
            reuseableMethods.findingElement(maxPrice).click();
            driver.findElement(maxPrice).sendKeys("520");
            driver.findElement(uygula).click();
        }
        if (input.equals("email")) {
            reuseableMethods.findingElement(emailBox);
            driver.findElement(emailBox).sendKeys("farukyucel5@gmail.com");
        }
        if (input.equals("sifre")){
            reuseableMethods.findingElement(passwordBox);
            driver.findElement(passwordBox).sendKeys("Faruk12068036");
        }
        if (input.equals("kart bilgileri")){
            reuseableMethods.scrollTo("Alışveriş kredisi 3 Ay Sonra Öde");
            reuseableMethods.findingElement(kartNo);
            driver.findElement(kartNo).sendKeys("4242424242424242");
            driver.findElement(kartUzerindekiIsim).sendKeys("faruk yucel");
            driver.findElement(sonKullanmaTarihi).sendKeys("1025");
            driver.findElement(cvc).sendKeys("234");
        }

    }






}
