package Base;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter

public abstract class User {

    private final String name;
    private final String email;
    private final int phoneNumber;
    private int age;

}
