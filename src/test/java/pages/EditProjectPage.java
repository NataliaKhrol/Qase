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


    public void editProject(String suiteName, String contestEntry) {

        $(ADD_FILTER).click();
        $(CREATESUITE_BTN).click();
        $(SUITE_NAME).sendKeys(suiteName);
        $(CONTEST_ENTRY).sendKeys(contestEntry);
        $(SAVE_BTN).click();
    }
}

//These comments I left just to remember my trials and mistakes
//   private By PROJECT_BUTTON = By.cssSelector("[href=\"/project/QASEQS\"]");
//  $(PROJECT_BUTTON).click();
//     $(TITLE_BUTTON).sendKeys("Create new case");
//  $("[class=\"UdZcu9\"]").click();
//   $("[class=\"DJXdnf N7aVnv\"]").click();
//   $("#save-case").click();
//   $$("[class=\"nbWgel\"]").get(0).click();
