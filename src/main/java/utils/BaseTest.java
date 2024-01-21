package utils;

import com.codeborne.selenide.Configuration;
import org.junit.Before;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest extends BaseRouter {

    public static BaseRouter baseRouter;
    public BaseTest(){baseRouter = new BaseRouter();}

    @BeforeMethod
    public void setConfig(){
        Configuration.browserSize = "1920x1070";
        System.setProperty("webdriver.chrome.driver", "src/main/java/utils/chromedriver");
        open("https://testpages.eviltester.com/styled/basic-html-form-test.html");
    }
}
