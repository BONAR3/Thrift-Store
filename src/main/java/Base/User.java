package Base;

public abstract class User {

    private final String name;
    private final String email;
    private final int phoneNumber;
    private int age;


    public User(int age, int phoneNumber, String email, String name) {
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getAge() {
        return age;
    }
}
