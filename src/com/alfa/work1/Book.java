package com.alfa.work1;

public class Book {

    private int Id;
    private String Name;
    private String Author;
    private String Publishing;
    private int Year;
    private int Page;
    private double Price;

    public int getID() {
        return Id;
    }
    public String getName() {
        return Name;
    }
    public String getAuthor() {
        return Author;
    }
    public String getPublishing() {
        return Publishing;
    }
    public int getYear() {
        return Year;
    }
    public int getPage() {
        return Page;
    }
    public double getPrice() {
        return Price;
    }
    public void setID(int Id) {
        this.Id = Id;
    }
    public void setName(String name) {
        Name = name;
    }
    public void setAuthor(String author) {
        Author = author;
    }
    public void setPublishing(String publishing) {
        Publishing = publishing;
    }
    public void setYear(int year) {
        Year = year;
    }
    public void setPage(int page) {
        Page = page;
    }
    public void setPrice(double price) {
        Price = price;
    }

    public Book(){
    };

    public Book(int Id, String name, String author, String publishing, int year, int page, double price) {
        this.Id = Id;
        Name = name;
        Author = author;
        Publishing = publishing;
        Year = year;
        Page = page;
        Price = price;
    }

    public void view(){
        System.out.println(Id  + " " + Name + " " + Author + " " + Publishing + " " + Year + " " + Page + " " + Price);
    }
}
