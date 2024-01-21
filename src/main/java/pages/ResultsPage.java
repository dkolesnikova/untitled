package pages;

import utils.Locators;
import widgets.Button;
import widgets.InputText;
import widgets.Label;

public class ResultsPage {
    public Label name = new Label(Locators.ResultsPage.name);
    public Label password = new Label(Locators.ResultsPage.password);
    public Label comments = new Label(Locators.ResultsPage.comments);
    public Button goBackButton = new Button(Locators.ResultsPage.goBackButton);

}
