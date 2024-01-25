package widgets;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import data.enums.RadioButtons;
import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import utils.BaseRouter;

import static com.codeborne.selenide.Selenide.$;

@AllArgsConstructor

public class RadioButton extends BaseRouter {
    private By loc;

    public BaseRouter clickItem(RadioButtons button) {
        $(loc).scrollTo();
        ElementsCollection collection = $(loc).$$x("input");
        collection.filter(Condition.value(button.getValue())).get(0).click();
        return this;
    }
}
