import data.enums.RadioButtons;
import data.models.Object;
import org.testng.annotations.Test;
import utils.BaseTest;

import static data.dataClasses.ObjectData.getRandomUser;

public class ObjectTests extends BaseTest {
    @Test
    void check() {
        Object object = getRandomUser();
        authPage.name.inputText(object.getName());
        authPage.password.clearAndInputText(object.getPassword());
        authPage.comments.clearAndInputText(object.getComments());
        authPage.submitButton.click();
        resultsPage.name.shouldHaveText(object.getName());
        resultsPage.password.shouldHaveText(object.getPassword());
        resultsPage.comments.shouldHaveText(object.getComments());
    }


    @Test
    void check2() {
        Object object = getRandomUser();
        authPage.name.inputText(object.getName());
        authPage.password.clearAndInputText(object.getPassword());
        authPage.radioButton.clickItem(RadioButtons.RADIO_3);
        authPage.submitButton.click();
        resultsPage.name.shouldHaveText(object.getName());
        resultsPage.password.shouldHaveText(object.getPassword());
    }

}
