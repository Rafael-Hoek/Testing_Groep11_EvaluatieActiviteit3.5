package ui.steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import ui.Page;

public class ToonInfoAllergieënEnVegetarischSteps {
    private WebDriver driver;
    private String path = "http://localhost:8080/Controller";

    private Page currentPage;


    @Before
    public void setUp() {
        //System.setProperty("webdriver.chrome.driver", "/Users/.../web3pers/chromedriver");
        // windows: gebruik dubbele \\ om pad aan te geven
        // hint: zoek een werkende test op van web 2 ...
        System.setProperty("webdriver.chrome.driver", "D:\\school\\chromedriver");
        driver = new ChromeDriver();
    }

    @After
    public void clean() {
        driver.get(path+"?command=DeleteAll");
        driver.quit();
    }

    @Then("ziet “Rafael” welke broodjes vegetarisch zijn en welke broodjes een allergische reactie kunnen veroorzaken")
    public void Rafael_ziet_vegetarisch_en_allergische_broodjes() {

    }

    @Given("dat er een maaltijd zonder allergieën op het menu staat")
    public void dat_Er_Een_Maaltijd_Zonder_Allergieën_Op_Het_Menu_Staat() {
    }

    @When("“Rafael” naar deze maaltijd kijkt")
    public void rafael_Naar_Deze_Maaltijd_Kijkt() {
    }

    @Then("krijgt “Rafael” te zien dat de maaltijd geen allergieën bevat")
    public void krijgt_Rafael_Te_Zien_Dat_De_Maaltijd_Geen_Allergieën_Bevat() {
    }
}
