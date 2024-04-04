package Guia2;

import java.time.LocalDateTime;
import java.util.UUID;


public class mainGuia2 {
    public static void main(String[] args) {
        /*
        //region Ej 1
        Author authorOne = new Author("Joshua", "Bloch", "joshua@email.com", 'M');
        System.out.println(authorOne);
        Author authorTwo = new Author("Joshua", "Oliver", "joshuaoliver@email.com", 'F');
        Book bookOne = new Book("Effective Java", 450f, 150, authorOne);
        Book bookTwo = new Book("Effective Java", 450f, 150, authorOne,authorTwo);
        System.out.println(bookOne);
        System.out.println(bookTwo);
        bookOne.setPrice(500f);
        bookOne.setStock(bookOne.getStock() + 50);
        System.out.println(bookOne.getAuthor());
        bookOne.printMessage();
        bookTwo.printMessage();
        //endregion
        */
        //region EJ 2
        Client clientOne = new Client(UUID.randomUUID(),"Tadeo","tadeoborneo@outlook.com",50d);
        System.out.println(clientOne);
        Invoice invoiceOne = new Invoice(UUID.randomUUID(), 50000d, LocalDateTime.now(), clientOne);
        System.out.println("Monto total: $"+invoiceOne.getTotalMount());
        System.out.println("Monto con el descuento: $"+invoiceOne.getDiscountedAmount());
        System.out.println(invoiceOne);
    }
}
