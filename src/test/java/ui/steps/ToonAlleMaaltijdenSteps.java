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
import ui.PatientsPage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ToonAlleMaaltijdenSteps {
    private WebDriver driver;
    private String path = "http://localhost:8080/Controller";

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

    @Given("dat er maaltijden op het menu staan")
    public void Er_staan_maaltijden_op_het_menu() {
        currentPage = PageFactory.initElements(driver, MealsPage.class);
    }

    @When("“Rafael” op het menu kijkt")
    public void Rafael_kijkt_op_het_menu() {
    }

    @Then("worden alle maaltijden getoond die op het menu staan")
    public void alle_die_op_het_menu_staan_maaltijden_worden_getoond() {
        assertEquals("Product Overview", driver.getTitle());
        assertTrue(((MealsPage)currentPage).containsMealWithName("Lasagna"));
        assertTrue(((MealsPage)currentPage).containsMealWithName("Tomatensoep"));
    }

    @Given("er geen maaltijden op het menu staan")
    public void er_staan_geen_maaltijden_op_het_menu() {
        currentPage = PageFactory.initElements(driver, MealsPage.class);
        ((MealsPage) currentPage).goToPageNoMeals();
    }

    @Then("krijgt “Rafael” een melding dat er momenteel nog geen broodjes op het menu staan")
    public void Rafael_krijgt_een_melding_dat_er_geen_broodjes_zijn() {
        ((MealsPage) currentPage).containsStringNoMeals();
    }
}
