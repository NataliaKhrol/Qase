package pages;

import static com.codeborne.selenide.Selenide.$;

public class EditProjectPage {
    public void editProject() {
        $("[href=\"/project/QS\"]").click();
        $("#create-case-button").click();
        $("#title").sendKeys("Create new case");
        $("[class=\"UdZcu9\"]").click();
        $("[class=\"DJXdnf N7aVnv\"]").click();
        $("#save-case").click();
    }
}
