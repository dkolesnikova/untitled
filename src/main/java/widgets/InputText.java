package widgets;

import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import utils.BaseRouter;

import static com.codeborne.selenide.Selenide.$;

@AllArgsConstructor
public class InputText extends BaseRouter {
    private By loc;

    public BaseRouter inputText(String value) {
        $(loc).scrollTo();
        $(loc).sendKeys(value);
        return this;
    }

    public BaseRouter clearAndInputText(String string) {
        $(loc).scrollTo();
        $(loc).clear();
        $(loc).sendKeys(string);
        return this;
    }
    public BaseRouter clearText(){
        $(loc).scrollTo();
        $(loc).clear();
        return this;
    }
}
