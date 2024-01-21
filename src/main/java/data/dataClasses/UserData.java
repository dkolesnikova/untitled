package data.dataClasses;

import com.github.javafaker.Faker;
import data.models.User;

public class UserData {
    public static User getRandomUser(){
        Faker faker = new Faker();
        return User.builder()
                .name(faker.name().fullName())
                .password(faker.animal().name())
                .comments(faker.lordOfTheRings().location())
                .build();
    }
}
