package data.models;

import data.enums.RadioButtons;
import lombok.Builder;
import lombok.Getter;
import widgets.RadioButton;

@Builder
@Getter
public class Object {
    public String name;
    public String password;
    public String comments;
    public RadioButtons radioButton;
}
