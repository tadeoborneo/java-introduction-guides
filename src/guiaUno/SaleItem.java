package guiaUno;

public class SaleItem {
    private String id;
    private String description;
    private Integer numberOfItems;
    private Float unitPrice;
    private Float totalPrice;

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public SaleItem(String id, String description, Integer numberOfItems, Float unitPrice) {
        this.id = id;
        this.description = description;
        this.numberOfItems = numberOfItems;
        this.unitPrice = unitPrice;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getNumberOfItems() {
        return numberOfItems;
    }

    public void setNumberOfItems(Integer numberOfItems) {
        this.numberOfItems = numberOfItems;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Float totalPrice(){
        return unitPrice * numberOfItems;
    }

    @Override
    public String toString() {
        return "SaleItem{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", numberOfItems=" + numberOfItems +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
