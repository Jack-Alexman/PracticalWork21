package com.alfa.work1;

public class Runner {
    public void run(){
        Book book = new Book();
        book.setID(1);
        book.setName("Name");
        book.setAuthor("Author");
        book.setPublishing("Author");
        book.setYear(1999);
        book.setPage(29);
        book.setPrice(19.99);

        System.out.print(book.getID() + " " + book.getName() + " " + book.getAuthor() + " " +
                book.getPublishing() + " " + book.getYear() + " " + book.getPage() + " " + book.getPrice() + " " );

    }
}
