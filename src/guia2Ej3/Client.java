package guia2Ej3;

import java.util.UUID;

public class Client {
    private UUID id;
    private String name;
    private Character gender;

    public Client() {
    }

    public Client(String name, Character gender) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.gender = gender;
    }

    public UUID getId() {
        return id;
    }

    public void UUID(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
