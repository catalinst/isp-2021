package com.isp.lab4.exercise4;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        Author author = new Author("Mark Twain", "mark@yahoo.com", 'M');
        Author author1 = new Author("JK Rowling", "rowling@yahoo.com", 'F');
        Author author2 = new Author("Jose Cortez", "cortez@yahoo.com", 'M');
        Author[] authors = new Author[3];
        authors[0] = author;
        authors[1]= author1;
        authors[2]=  author2;
        Book book = new Book("Tom Sawyer", authors, 3.0);
        System.out.println(book);
        System.out.println(Arrays.toString(book.getAuthors()));
        book.printAuthors();
    }
}
