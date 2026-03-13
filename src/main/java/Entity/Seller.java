package Entity;

import Base.User;
import lombok.AllArgsConstructor;

public class Seller extends User {

    private int sellerID;
    private String password;

    public Seller(String name, String email, int phoneNumber, int age, int sellerID, String password) {
        super(name, email, phoneNumber, age);
        this.sellerID = sellerID;
        this.password = password;
    }
}
