package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class OverviewPage extends Page {
    public OverviewPage(WebDriver driver) {
        super(driver);
        this.driver.get(getPath()+"?command=Overview");
    }


    public boolean containsBroodje (String s) {
        List<WebElement> trs = driver.findElements(By.cssSelector("td"));
        for (WebElement tr: trs) {
            if (tr.getText().equals(s)){
                return true;
            }
        }
        return false;
    }
}
