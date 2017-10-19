package mytest.example.au.test.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Communication {
    private String url = "http://newtours.demoaut.com/mercurywelcome.php";
    private static WebDriver driver = new FirefoxDriver();

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public void implicitWait(String idName) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 500L);
        wait.until(ExpectedConditions.visibilityOf(getDriver().findElement(By.name(idName))));
    }

    public Communication() {
        getDriver().navigate().to(this.getUrl());
        this.implicitWait("login");
    }
}