package com.isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String[] args) {
        Author author = new Author("Mark Twain", "mark@yahoo.com", 'M');
        Book book = new Book("Tom Sawyer", author, 3.0);
        System.out.println(book);
    }
}
