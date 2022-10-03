package pages;

import static com.codeborne.selenide.Selenide.*;
import static java.awt.SystemColor.text;

public class DeleteProjectPage {
    public void openPage() {
        open("/projects");
    }

    public void deleteProject() {
        $$("[class=\"fa fa-ellipsis-h\"]").get(2).click();
        $$("[class=\"text-danger\"]").get(2).click();
        $("[class=\"btn btn-cancel\"]").click();
    }
}
