package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateNewProjectPage {
    private By TITLE = By.cssSelector("#inputTitle");
    private By CODE_INPUT = By.cssSelector("#inputCode");
    private By DESCRIPTION_INPUT = By.cssSelector("#inputDescription");

    public void createProject() {
        $("#createButton").click();
        $(TITLE).sendKeys("Qase");
        $(CODE_INPUT).sendKeys("QS");
        $(DESCRIPTION_INPUT).sendKeys("The third project in Qase");
        $("#public-access-type").click();
        $("[class=\"btn btn-primary\"]").click();
    }
}
