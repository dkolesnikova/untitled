import data.models.User;
import utils.BaseTest;

import static data.dataClasses.UserData.getRandomUser;

public class Test extends BaseTest {
@org.testng.annotations.Test
    void check (){
    User user = getRandomUser();
        authPage.name.inputText(user.getName());
        authPage.password.clearAndInputText(user.getPassword());
        authPage.comments.clearAndInputText(user.getComments());
        authPage.submitButton.click();
        resultsPage.name.shouldHaveText(user.getName());
        resultsPage.password.shouldHaveText(user.getPassword());
        resultsPage.comments.shouldHaveText(user.getComments());
    }
}
