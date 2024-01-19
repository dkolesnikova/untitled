package widgets;

import lombok.AllArgsConstructor;
import org.openqa.selenium.By;
import utils.BaseRouter;

import static com.codeborne.selenide.Selenide.$;
@AllArgsConstructor
    public class InputText extends BaseRouter {
        private By loc;
        public BaseRouter inputText(String string) {
            $(loc).scrollTo();
            $(loc).sendKeys(string);
            return this;
        }
}
