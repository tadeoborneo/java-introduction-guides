package guia4.models;


public class Film {
    private String title;
    private String genre;
    private String releaseDate;
    private String minuteDuration;
    private String audienceClassification;
    private String originCountry;
    private String description;
    private Integer stock;

    public Film() {
    }

    public Film(String title, String genre, String releaseDate, String minuteDuration, String audienceClassification, String originCountry, String description, Integer stock) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.minuteDuration = minuteDuration;
        this.audienceClassification = audienceClassification;
        this.originCountry = originCountry;
        this.description = description;
        this.stock = stock;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getMinuteDuration() {
        return minuteDuration;
    }

    public void setMinuteDuration(String minuteDuration) {
        this.minuteDuration = minuteDuration;
    }

    public String getAudienceClassification() {
        return audienceClassification;
    }

    public void setAudienceClassification(String audienceClassification) {
        this.audienceClassification = audienceClassification;
    }

    public String getOriginCountry() {
        return originCountry;
    }

    public void setOriginCountry(String originCountry) {
        this.originCountry = originCountry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Film{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", minuteDuration='" + minuteDuration + '\'' +
                ", audienceClassification='" + audienceClassification + '\'' +
                ", originCountry='" + originCountry + '\'' +
                ", description='" + description + '\'' +
                ", stock=" + stock +
                '}';
    }
}
