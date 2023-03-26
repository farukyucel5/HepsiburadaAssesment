package util;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ReuseableMethods {
    AppiumDriver driver;
    WebDriverWait wait;
    Actions action;

    public ReuseableMethods(AppiumDriver driver){
        this.driver = driver;
        this.action = new Actions(driver);
    }

    public WebElement findingElement(By key){
        wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(key));
    }
    public void scrollToAndClickOn(String textFromOutside,By key){

        AppiumBy.ByAndroidUIAutomator permissionElement = new AppiumBy.ByAndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true).instance(0))." +
                "scrollIntoView(new UiSelector()" + ".textMatches(\"" + textFromOutside + "\").instance(0))");
        driver.findElement(permissionElement);
        findingElement(key).click();

    }

    public String scrollToelementAndGetText(String textFromOutside){

        AppiumBy.ByAndroidUIAutomator permissionElement = new AppiumBy.ByAndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true).instance(0))." +
                "scrollIntoView(new UiSelector()" + ".textMatches(\"" + textFromOutside + "\").instance(0))");

         return driver.findElement(permissionElement).getText();
    }

    public void scrollTo(String textFromOutside){

        AppiumBy.ByAndroidUIAutomator permissionElement = new AppiumBy.ByAndroidUIAutomator("new UiScrollable" +
                "(new UiSelector().scrollable(true).instance(0))." +
                "scrollIntoView(new UiSelector()" + ".textMatches(\"" + textFromOutside + "\").instance(0))");

        driver.findElement(permissionElement);

    }

}
