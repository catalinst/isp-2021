package com.isp.lab3.Exercise3;

public class Exercise3 {

    public static void main(String[] args) {
        Author author = new Author("Dostoievsky", "undefined", 'M');
        System.out.println(author);
        System.out.println(author.getName());
        System.out.println(author.getEmail());
        System.out.println(author.getGender());
    }
}
