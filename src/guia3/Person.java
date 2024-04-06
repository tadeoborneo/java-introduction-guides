package guia3;

public class Person {
    private String dni;
    private String name;
    private String surname;
    private String email;
    private String address;

    public Person() {
    }

    public String getDni() {
        return dni;
    }

    public Person(String dni, String name, String surname, String email, String address) {
        this.dni = dni;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.address = address;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public String toString() {
        return "Person{" +
                "dni='" + dni + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
