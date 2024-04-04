package Guia2;

public class Book {
    private String title;
    private Float price;
    private Integer stock;
    private Author author;

    private Author otherAuthor;

    public Book(String title, Float price, Integer stock, Author author) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = author;
    }

    public Book(String title, Float price, Integer stock, Author author, Author otherAuthor) {
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = author;
        this.otherAuthor = otherAuthor;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Author getOtherAuthor() {
        return otherAuthor;
    }

    public void setOtherAuthor(Author otherAuthor) {
        this.otherAuthor = otherAuthor;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", stock=" + stock +
                ", author=" + author +
                '}';
    }

    public void printMessage() {
        if(this.otherAuthor == null)
            System.out.printf("El libro, %s de %s . Se vende a %.2f pesos.\n", this.title, this.author.getName(), this.price);
        else
            System.out.printf("El libro, %s de %s y %s. Se vende a %.2f pesos.\n", this.title, this.author.getName(), this.otherAuthor.getName(), this.price);
    }


}
