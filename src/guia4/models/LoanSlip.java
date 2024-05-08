package guia4.models;

import java.time.LocalDateTime;

public class LoanSlip {
    private Film film;
    private Client client;
    private LocalDateTime retirementDate;
    private LocalDateTime returnDate;

    public LoanSlip() {
    }

    public LoanSlip(Film film, Client client, LocalDateTime retirementDate, LocalDateTime returnDate) {
        this.film = film;
        this.client = client;
        this.retirementDate = retirementDate;
        this.returnDate = returnDate;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDateTime getRetirementDate() {
        return retirementDate;
    }

    public void setRetirementDate(LocalDateTime retirementDate) {
        this.retirementDate = retirementDate;
    }

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(LocalDateTime returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "LoanSlip{" +
                "film=" + film +
                ", client=" + client +
                ", retirementDate=" + retirementDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
