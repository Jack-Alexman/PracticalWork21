package com.alfa.work1;

public class Runner {
    public void run(){
        Book book = new Book();
        Book book1 = new Book("Name", "Author", "Publishing", 1999, 29, 19.99);
        book.setName("Name1");
        book.setPrice(1000);
        book.view();
        book1.view();
    }
}
