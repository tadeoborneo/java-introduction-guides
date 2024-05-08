package guia4.models;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    private List<Film> filmCollection = new ArrayList<>();
    private List<LoanSlip> loanSlips = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();

    public VideoStore(List<Film> filmCollection, List<LoanSlip> loanSlips, List<Client> clients) {
        this.filmCollection = filmCollection;
        this.loanSlips = loanSlips;
        this.clients = clients;
    }

    public VideoStore() {

    }

    public List<Film> getFilmCollection() {
        return filmCollection;
    }

    public void setFilmCollection(List<Film> filmCollection) {
        this.filmCollection = filmCollection;
    }

    public List<LoanSlip> getLoanSlips() {
        return loanSlips;
    }

    public void setLoanSlips(List<LoanSlip> loanSlips) {
        this.loanSlips = loanSlips;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "VideoStore{" +
                "filmCollection=" + filmCollection +
                ", loanSlips=" + loanSlips +
                ", clients=" + clients +
                '}';
    }

    public Film searchFilm (String  filmName) {
        for(Film f : filmCollection) {
            if(f.getTitle().equalsIgnoreCase(filmName))
                return f;
        }
        return null;
    }

    public LoanSlip rentFilm(Film film, Client client) {
        
    }
}
