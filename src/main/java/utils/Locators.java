package utils;

import org.openqa.selenium.By;

public interface Locators {
    interface AuthPage {
        By name = By.cssSelector("input[name=username]");
        By password = By.cssSelector("input[name=password]");
        By comments = By.cssSelector("textarea[name=comments]");
        By chooseFile = By.cssSelector("input[name=filename]");
        By checkboxItems = By.xpath("//td[contains(text(),'Checkbox Items:')]");
        By radioItems = By.xpath("//*[contains(text(),'Radio Items')]");
        By multipleSelect = By.xpath("//*[contains(text(),'Multiple Select Values')]");
        By dropdown = By.cssSelector("dropdown");
        By cancelButton = By.cssSelector("submitbutton");
        By submitButton = By.cssSelector("input[value=submit]");
    }

    interface ResultsPage {
        By formResults = By.cssSelector("centered form-results");
        By name = By.cssSelector("#_valueusername");
        By password = By.cssSelector("#_valuepassword");
        By comments = By.cssSelector("#_valuecomments");
        By fileName = By.cssSelector("#_filename");
        By hiddenField = By.cssSelector("#_hiddenField");
        By checkboxes = By.cssSelector("#_checkboxes");
        By radioValue = By.cssSelector("#_valueradioval");
        By multipleSelect = By.cssSelector("#_valuemultipleselect0");
        By dropdown = By.cssSelector("#_valuedropdown");
        By goBackButton = By.cssSelector("#back_to_form");
    }
}
