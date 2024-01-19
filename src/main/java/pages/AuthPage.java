package pages;

import utils.BaseRouter;
import utils.Locators;
import widgets.Button;
import widgets.InputText;

public class AuthPage {
    public InputText name = new InputText(Locators.AuthPage.name);
    public InputText password = new InputText(Locators.AuthPage.password);
    public InputText comments = new InputText(Locators.AuthPage.comments);
    public Button submitButton = new Button(Locators.AuthPage.submitButton);
}
