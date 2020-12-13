package ui.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import ui.MealsPage;
import ui.Page;

import static org.junit.Assert.assertTrue;

public class ToonPrijsSteps {
    private WebDriver driver;
    private String path = "http://localhost:8080/Testing_3_5_war_exploded/Controller";

    private Page currentPage;


    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "/Users/.../web3pers/chromedriver");
        // windows: gebruik dubbele \\ om pad aan te geven
        // hint: zoek een werkende test op van web 2 ...
        //System.setProperty("webdriver.chrome.driver", "C:\\school\\chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rickc\\Documents\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        currentPage = PageFactory.initElements(driver, MealsPage.class);
    }

    @After
    public void clean() {
        driver.quit();
    }

    @Then("worden alle maaltijden die op het menu staan met hun prijs getoond")
    public void alle_maaltijden_worden_met_prijs_getoond () {
        assertTrue(((MealsPage)currentPage).containsPrijs());
    }
}
