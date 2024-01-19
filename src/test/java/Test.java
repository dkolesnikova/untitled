import utils.BaseTest;

public class Test extends BaseTest {
@org.testng.annotations.Test
    void check (){
        authPage.name.inputText("Илюша");
        authPage.password.inputText("123");
        authPage.comments.inputText("1");
        authPage.submitButton.click();
    }
}
