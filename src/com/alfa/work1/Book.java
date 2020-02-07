package com.alfa.work1;

public class Book {

    private int id;
    private String name;
    private String author;
    private String publishing;
    private int year;
    private int page;
    private double price;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublishing() {
        return publishing;
    }
    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public Book(String name, String author, String publishing, int year, int page, double price) {
        this.name = name;
        this.author = author;
        this.publishing = publishing;
        this.year = year;
        this.page = page;
        this.price = price;
    }
    public Book() {
        this("Name", "Author", "Publishing", 1999, 29, 19.99);
    }

    public void view(){
        System.out.println(id  + " " + name + " " + author + " " + publishing + " " + year + " " + page + " " + price);
    }
}
