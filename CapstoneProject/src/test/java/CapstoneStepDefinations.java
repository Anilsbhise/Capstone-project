import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CapstoneStepDefinations extends BaseTest {

    @Given("I launch the URL {string}")
    public void launchUrl(String url) {
        driver.get(url);
    }

    @When("I verify the title of the page as {string}")
    public void verifyTitle(String title) {
        Assert.assertEquals(driver.getTitle(), title);
    }

    @When("I click on the link {string}")
    public void clickOnLink(String linkText) {
        driver.findElement(By.linkText(linkText)).click();
    }

    @Then("I verify the text on the page as {string}")
    public void verifyText(String text) {
        Assert.assertEquals(driver.findElement(By.tagName("body")).getText(), text);
    }

    @Given("I navigate back to Home page")
    public void navigateBackToHome() {
        driver.navigate().back();
    }

    @When("I click on the dropdown link")
    public void clickOnDropdownLink() {
        driver.findElement(By.id("dropdown")).click();
    }

    @When("I select the option {string}")
    public void selectOption(String option) {
        driver.findElement(By.xpath("//option[text()='" + option + "']")).click();
    }

    @Then("I verify the option {string} is selected")
    public void verifyOptionIsSelected(String option) {
        Assert.assertTrue(driver.findElement(By.xpath("//option[text()='" + option + "']")).isSelected());
    }

    @When("I click on Frames")
    public void clickOnFrames() {
        driver.findElement(By.linkText("Frames")).click();
    }

    @Then("I verify the hyperlink {string} is presented")
    public void verifyHyperlinkIsPresented(String hyperlinkText) {
        Assert.assertTrue(driver.findElement(By.linkText(hyperlinkText)).isDisplayed());
    }
}
