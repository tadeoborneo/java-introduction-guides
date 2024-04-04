package guia2Ej3;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.UUID;

public class Account {
    private UUID id;
    private Double balance;
    private Client client;

    private ArrayList<String> depositsInfo;
    private ArrayList<String> extractionsInfo;
    public Account() {
    }

    public Account(Double balance, Client client) {
        this.id = UUID.randomUUID();
        this.balance = balance;
        this.client = client;
        this.extractionsInfo = new ArrayList<>();
        this.depositsInfo = new ArrayList<>();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", client=" + client +
                '}';
    }

    public void deposit(Double money) {
        this.balance += money;
        this.depositsInfo.add("El cliente "+this.client.getName()+", deposito $"+money);
    }

    public void extraction(Double money) {
        if (this.balance < money - 2000d)
            System.out.println("Not enough balance");
        else {
            this.balance -= money;
            this.extractionsInfo.add("El cliente "+this.client.getName()+", retiro $"+money);
        }

    }

    public ArrayList<String> getDepositsInfo() {
        return depositsInfo;
    }

    public ArrayList<String> getExtractionsInfo() {
        return extractionsInfo;
    }
}
