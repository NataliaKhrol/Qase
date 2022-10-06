package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class EditProjectPage {
    private By ADD_FILTER = By.cssSelector("[class=\"add-filter-button\"]");
    private By TITLE_BUTTON = By.cssSelector("#title");
    private By CREATESUITE_BTN = By.cssSelector("#create-suite-button");
    private By SUITE_NAME = By.cssSelector("#name");
    private By CONTEST_ENTRY = By.cssSelector("[class=\"ProseMirror toastui-editor-contents\"]");
    private By SAVE_BTN = By.cssSelector("#save-suite-button");
private By FILTER_BTN = By.xpath("//button[contains(text(),'Priority')]");
    private By PRIORITY_BTN = By.xpath("//span[contains(text(),'High')]");


    public void editProject(String suiteName, String contestEntry) {

        $(ADD_FILTER).click();
        $(FILTER_BTN).click();
        $(PRIORITY_BTN).click();
        $(CREATESUITE_BTN).click();
        $(SUITE_NAME).sendKeys(suiteName);
        $(CONTEST_ENTRY).sendKeys(contestEntry);
        $(SAVE_BTN).click();
    }
}
