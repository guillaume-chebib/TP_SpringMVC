package fr.poly.mtp.ig5.iwa.model;

public class Registration {



    private String name;
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
