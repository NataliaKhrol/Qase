package pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage {
    public void openPage(){
        open("/login");


    }
    public void login(String user, String password){
        $("#inputEmail").sendKeys(user);
        $("#inputPassword").sendKeys(password);
        $("#btnLogin").click();
     //  $("#createButton").w(visible, 500000);

    //   $(tableSystemInfoBy).waitUntil(visible, 30000).isEnabled();

    }
}
