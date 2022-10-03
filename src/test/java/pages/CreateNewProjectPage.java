package pages;

import static com.codeborne.selenide.Selenide.$;

public class CreateNewProjectPage {
    public void createProject() {
        $("#createButton").click();
        $("#inputTitle").sendKeys("Qase");
        $("#inputCode").sendKeys("QS");
        $("#inputDescription").sendKeys("The third project in Qase");
        $("#public-access-type").click();
        $("[class=\"btn btn-primary\"]").click();
    }
}
