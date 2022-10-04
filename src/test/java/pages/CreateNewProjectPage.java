package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class CreateNewProjectPage {
    private By TITLE = By.cssSelector("#inputTitle");
    private By INPUT_CODE = By.cssSelector("#inputCode");

    public void createProject() {
        $("#createButton").click();
        $(TITLE).sendKeys("Qase");
        $(INPUT_CODE).sendKeys("QS");
        $("#inputDescription").sendKeys("The third project in Qase");
        $("#public-access-type").click();
        $("[class=\"btn btn-primary\"]").click();
    }
}
