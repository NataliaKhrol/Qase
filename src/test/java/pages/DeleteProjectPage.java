package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static java.awt.SystemColor.text;

public class DeleteProjectPage {
    private By PROJECT_BTN = By.cssSelector("[class=\"btn btn-dropdown\"]");

    private By DELETE_BUTTON = By.xpath("//a[text()='Delete']");
    private By CANCEL_BUTTON = By.cssSelector("[class=\"btn btn-cancel\"]");


    public void openPage() {
        open("/projects");
    }

    public void deleteProject() {
        $(PROJECT_BTN).click();
        $(DELETE_BUTTON).click();
        $(CANCEL_BUTTON).click();
    }
}
        // $("[href=\"/project/QS/delete\"]").click();
