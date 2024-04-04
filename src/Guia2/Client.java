package Guia2;

import java.util.UUID;
public class Client {
    private UUID id;
    private String name;
    private String email;
    private Double discount;

    public Client(UUID id, String name, String email, Double discount) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.discount = discount;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", discount=" + discount +
                "%}";
    }
}
