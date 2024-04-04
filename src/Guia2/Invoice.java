package Guia2;


import java.time.LocalDateTime;
import java.util.UUID;

public class Invoice {
    private UUID id;
    private Double totalAmount;
    private LocalDateTime date;
    private Client client;

    public Invoice(UUID id, Double totalMount, LocalDateTime date, Client client) {
        this.id = id;
        this.totalAmount = totalMount;
        this.date = date;
        this.client = client;
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
}
