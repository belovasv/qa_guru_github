import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Search {

    String keyWord = "selenide";

    @Test
    void searchGoogle() {
        open("https://google.com/");
        $(byName("q")).val(keyWord).pressEnter();
        $("#search").shouldHave(Condition.text("ru.selenide.org"));
    }

    @Test
    void searchYandex() {
        open("https://yandex.ru/");
        $("#text").val(keyWord).pressEnter();
        $("body").shouldHave(Condition.text("ru.selenide.org"));
    }
}
