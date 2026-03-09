package Entity;

import Base.User;

public class Admin extends User {

    private String password;
    private int adminId;

    public Admin(String name, String email, int phoneNumber, int age, String password, int adminId) {
        super(name, email, phoneNumber, age);
        this.password = password;
        this.adminId = adminId;
    }
}
