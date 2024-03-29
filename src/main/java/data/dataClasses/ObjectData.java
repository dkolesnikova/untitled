package data.dataClasses;

import com.github.javafaker.Faker;
import data.enums.RadioButtons;
import data.models.Object;

public class ObjectData {
    public static Object getRandomUser() {
        Faker faker = new Faker();
        return Object.builder()
                .name(faker.name().fullName())
                .password(faker.animal().name())
                .comments(faker.lordOfTheRings().location())
                .radioButton(RadioButtons.RADIO_1)
                .build();
    }
}
