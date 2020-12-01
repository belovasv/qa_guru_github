import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Search {

    String keyWord = "selenide";

    @Test
    void searchGoogle() {
        open("https://google.com/");
        $(byName("q")).val(keyWord).pressEnter();
        $("#search").shouldHave(Condition.text("ru.selenide.org"));
    }
}
