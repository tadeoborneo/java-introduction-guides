package Guia2;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.UUID;

public class Invoice {
    private UUID id;
    private Double totalAmount;
    private LocalDateTime date;
    private Client client;
    private ArrayList<ItemSell> items;

    public Invoice(UUID id, LocalDateTime date, Client client, ArrayList<ItemSell> items) {
        this.id = id;
        this.date = date;
        this.client = client;
        this.items = items;
        this.totalAmount = calculateTotalAmount();
    }


    public Double getTotalMount() {
        return totalAmount;
    }

    public void setTotalMount(Double totalMount) {
        this.totalAmount = totalMount;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getDiscountedAmount(){
        return this.totalAmount - this.totalAmount * this.client.getDiscount() / 100d;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id=" + id +
                ", date=" + date+
                ", totalAmount=" + totalAmount +
                ", discountedAmount="+this.getDiscountedAmount()+
                ", client=" + client +
                '}';
    }

    public Double calculateTotalAmount(){
        Double Amount = 0.0;
        for(ItemSell item : this.items){
            Amount += item.getUnitPrice();
        }
        return Amount;
    }
}
