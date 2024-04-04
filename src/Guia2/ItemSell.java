package Guia2;

import java.util.UUID;

public class ItemSell {
    private UUID id;
    private String name;
    private String description;
    private Double unitPrice;

    public ItemSell(UUID id, String name, String description, Double unitPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "ItemSell{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}
