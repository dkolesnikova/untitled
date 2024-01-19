package utils;

import org.junit.Before;

import static com.codeborne.selenide.Selenide.open;

public class BaseTest extends BaseRouter {

    public static BaseRouter baseRouter;
    public BaseTest(){baseRouter = new BaseRouter();}

    @Before
    void setConfig(){
        open("https://testpages.eviltester.com/styled/basic-html-form-test.html");
    }


}
