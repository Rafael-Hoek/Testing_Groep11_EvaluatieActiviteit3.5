package ui.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import ui.MealsPage;
import ui.Page;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GroepeerMaaltijdenSteps {
    private WebDriver driver;
    private String path = "http://localhost:8080/Testing_3_5_war_exploded/Controller";

    private Page currentPage;


    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "/Users/.../web3pers/chromedriver");
        // windows: gebruik dubbele \\ om pad aan te geven
        // hint: zoek een werkende test op van web 2 ...
        System.setProperty("webdriver.chrome.driver", "C:\\school\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void clean() {
        driver.quit();
    }


   // @Given("dat er maaltijden op het menu staan")
    //public void test() {}

    @When("“Rafael” op het menu kijkt")
    public void Rafael_kijkt_op_het_menu() {
        currentPage = PageFactory.initElements(driver, MealsPage.class);
    }



    @Then("worden alle maaltijden getoond, gegroepeerd per categorie")
    public void maaltijden_worden_gegroepeerd_getoond() {
        assertEquals("Product Overview", driver.getTitle());
        assertTrue(((MealsPage)currentPage).containsCategory("Broodjes"));
        assertTrue(((MealsPage)currentPage).containsCategory("Pasta's"));
        assertTrue(((MealsPage)currentPage).containsCategory("Soepen"));
    }
}
