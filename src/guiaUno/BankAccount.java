package guiaUno;

public class BankAccount {
    private String id;
    private String name;
    private Float balance;

    public BankAccount(String id, String name, Float balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Float credit(Float credit){
        return this.balance += credit;
    }

    public Float debit(Float debit){
        if(this.balance >= debit){
            return this.balance -= debit;
        }
        else{
            System.out.println("Insufficient balance");
            return this.balance;
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
