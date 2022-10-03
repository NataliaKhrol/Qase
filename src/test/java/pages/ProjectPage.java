package pages;

import com.codeborne.selenide.Condition;

import java.time.Duration;

import static com.codeborne.selenide.Selenide.$;

public class ProjectPage {
    public void isOpened(){
        $("#createButton").shouldBe(Condition.visible);
     //   $("#createButton").should(Condition, Duration.ofMillis(25_000));

    }
}
