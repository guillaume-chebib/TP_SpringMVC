package fr.poly.mtp.ig5.iwa.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class Registration {


    @NotEmpty(message="Name must not be empty")
    private String name;
    @Email(message="Email is not well-formed")
    private String email;

    public Registration(String name, String email) {
        this.name = name;
        this.email = email;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Registration{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
