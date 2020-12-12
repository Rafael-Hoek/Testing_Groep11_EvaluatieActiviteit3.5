package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MealsPage extends Page{

    public MealsPage(WebDriver driver) {
        super(driver);
        goToPage();
    }

    public void goToPage(){
        this.driver.get(getPath()+"?command=Overview");
    }

    public void goToPageNoMeals(WebDriver driver) {
        this.driver.get(getPath()+"?command=OverviewLeeg");
    }

    public boolean containsMealWithName(String name) {

        List<WebElement> listItems= driver.findElements(By.cssSelector("table tr"));
        List<String> names = Arrays.asList(name.split(" "));
        boolean found = false;

        for (WebElement listItem:listItems) {
            String[] itemsList = listItem.getText().split(" ");
            ArrayList<String> items = new ArrayList(Arrays.asList(itemsList));
            if (items.containsAll(names)) {
                found = true;
            }
        }
        return found;
    }

    public boolean containsMealWith(String thing) {
        List<WebElement> trs = driver.findElements(By.cssSelector("td"));
        for (WebElement tr: trs) {
            if (tr.getText().equals(thing)){
                return true;
            }
        }
        return false;
    }

    public boolean thereAreMeals() {
        List<WebElement> listItems = this.driver.findElements(By.cssSelector("td"));
        return !listItems.isEmpty();

    }

    public boolean containsStringNoMeals() {
        return driver.getPageSource().contains("Er zijn momenteel nog geen broodjes op het menu.");
    }

    public boolean containsCategory(String categorie) {
        List<WebElement> trs = driver.findElements(By.cssSelector("h2"));
        for (WebElement tr: trs) {
            if (tr.getText().equals(categorie)){
                return true;
            }
        }
        return false;
    }
}
