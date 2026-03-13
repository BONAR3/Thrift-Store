package Entity;

import Base.User;
import Enums.AdminCategory;

public class Admin extends User {

    private String password;
    private int adminId;
    private AdminCategory role;

    public Admin(String name, String email, int phoneNumber, int age, String password, int adminId) {
        super(name, email, phoneNumber, age);
        this.password = password;
        this.adminId = adminId;
    }
}
