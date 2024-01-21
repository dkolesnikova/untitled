package data.models;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class User {
    public String name;
    public String password;
    public String comments;
}
