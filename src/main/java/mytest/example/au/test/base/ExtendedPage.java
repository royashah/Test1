

package mytest.example.au.test.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public abstract class ExtendedPage {
    WebDriver driver = Communication.getDriver();

    public ExtendedPage() {
    }

    public void setTextBoxWithName(String name, String value) {
        this.driver.findElement(By.name(name)).sendKeys(new CharSequence[]{value});
    }

    public void selectWithName(String name) {
        this.driver.findElement(By.name(name)).click();
    }

    public void selectWithXpath(String name) {
        this.driver.findElement(By.xpath(name)).click();
    }

    public void selectDropDownList(String name, String value) {
        Select dropdown = new Select(this.driver.findElement(By.name(name)));
        dropdown.selectByVisibleText(value);
    }

    public void selectNameWithSpecificValue(String name, String value) {
        this.driver.findElement(By.name(name)).findElement(By.xpath("//input[@value=\"" + value + '\"' + "]")).click();
    }

    public void continueAction(String name) {
        this.driver.findElement(By.name(name)).click();
    }

    public abstract void init();
}
