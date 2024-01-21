package widgets;

import com.codeborne.selenide.Condition;
import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import utils.BaseRouter;

import static com.codeborne.selenide.Selenide.$;

@AllArgsConstructor

public class Label extends BaseRouter {
    private By loc;
    public BaseRouter shouldHaveText(String string){
        $(loc).shouldHave(Condition.exactText(string));
        return this;
    }

}
