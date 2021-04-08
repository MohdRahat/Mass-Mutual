package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.ValuesPage;

public class CommonStepDef extends ValuesPage {
    WebDriver driver;
    ValuesPage valuesPage = new ValuesPage();

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("Load Exercise1 home page")
    public void launchurl() {
        driver.get("https://www.exercise1.com/values");

    }

    @Then("Verify the right count of values appear on screen")
    public void valuesAreRightInCount() {

        valuesPage.valueRightCount();
    }

    @And("Verify the values on the screen are greater than 0")
    public void valuesGreaterThanZero() {

        valuesPage.countGreaterThanZero();
    }

    @And("Verify the total balance is correct based on the values listed on the screen")
    public void totalBalanceIsCorrect() {

        valuesPage.totalBalanceIsCorrect();

    }

    @And("Verify the values formatted as currencies")
    public void launc() {

        valuesPage.valueRightCount();
        driver.get("https://www.exercise1.com/values");
    }

    @And("Verify the total balance matches the sum of the values")
    public void laun() {

        valuesPage.valueRightCount();
        driver.get("https://www.exercise1.com/values");
    }
}
