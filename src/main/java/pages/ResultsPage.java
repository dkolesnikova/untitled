package pages;

import utils.Locators;
import widgets.Button;
import widgets.InputText;
import widgets.Label;
import widgets.RadioButton;

public class ResultsPage {
    public Label formResults = new Label(Locators.ResultsPage.formResults);
    public Label name = new Label(Locators.ResultsPage.name);
    public Label password = new Label(Locators.ResultsPage.password);
    public Label comments = new Label(Locators.ResultsPage.comments);
    public Label radioValue= new Label(Locators.ResultsPage.radioValue);
    public Button goBackButton = new Button(Locators.ResultsPage.goBackButton);

}
