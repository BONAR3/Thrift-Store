package Entity;

import Base.User;
import Interfaces.LogIn;

public class Customer extends User {

    private String userID;
    private String password;

    public Customer(String name, String email, int phoneNumber, int age, String userID, String password) {
        super(name, email, phoneNumber, age);
        this.userID = userID;
        this.password = password;
    }
}
