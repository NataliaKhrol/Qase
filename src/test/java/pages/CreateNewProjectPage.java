package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CreateNewProjectPage {
    private By TITLE = By.cssSelector("#inputTitle");
    private By CODE_INPUT = By.cssSelector("#inputCode");
    private By DESCRIPTION_INPUT = By.cssSelector("#inputDescription");
    private By CREATE_PROJECT = By.cssSelector("#createButton");
    private By PUBLIC_BUTTON = By.cssSelector("#public-access-type");
    private By CREARE_BUTTON = By.cssSelector("[class=\"btn btn-primary\"]");
    private By PROJECT_BUTTON = By.cssSelector("[href=\"/project/QASEQS\"]");


    public void createProject(String title, String code, String description) {
        $(CREATE_PROJECT).click();
        $(TITLE).sendKeys(title);
        $(CODE_INPUT).sendKeys(code);
        $(DESCRIPTION_INPUT).sendKeys(description);
        $(PUBLIC_BUTTON).click();
        $(CREARE_BUTTON).click();
    }
}
/*

    public void isCreated() {
        open("/projects");
        $(PUBLIC_BUTTON).shouldBe(Condition.visible);
    }
 */
