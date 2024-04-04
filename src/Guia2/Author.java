package Guia2;

public class Author {
    private String name;
    private String surname;
    private String email;
    private Character gender;

    public Author(String name, String surname, String email, Character gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        gender = gender;
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", Gender=" + gender +
                '}';
    }

}

