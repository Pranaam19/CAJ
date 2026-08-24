package lab4_1;

public class Author {
    String name;
    String email;
    Character gender;


    Author(String name, String email, Character gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Email: " + getEmail() + ", Gender: " + getGender();
    }

    public String getName() {
        return name;
    }

    public Character getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }
}
