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

    public boolean containsMealWith (String ssn) {
        List<WebElement> trs = driver.findElements(By.cssSelector("td"));
        for (WebElement tr: trs) {
            if (tr.getText().equals(ssn)){
                return true;
            }
        }
        return false;
    }
    public boolean thereAreMeals() {
        List<WebElement> listItems = this.driver.findElements(By.cssSelector("td"));
        return !listItems.isEmpty();

    }

}
