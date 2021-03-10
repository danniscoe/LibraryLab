package com.tts;

import java.awt.print.Book;
import java.util.*;
public class Library {

    String addr;
    ArrayList<Book> list;

    public Library(String address) {
        addr = address;
        list = new ArrayList<>();
    }

    public void addBook(Book addbook) {

        this.list.add(addbook);
    }

    public String openHours() {
        String hours = "We are open 24 hours a day!";
        return hours;
    }

    public String printAddr() {

        return addr;
    }

    public void borrowBook(String title) {
        for (Book book : this.list) {
            if (title.equals(book.getTitle())) {
                if (book.isBorrowed()) {
                    System.out.println("Sorry, this book is checked out.");
                } else {
                    book.borrowed();
                    System.out.println("You have borrowed " + book.getTitle());
                }
                return;
            }
        }
        System.out.println("Sorry, this book is not in our collection.");
    }
    public void availableBooks() {
        if (this.list.isEmpty()) {
            System.out.println("No book in the collection.");
        }
        for (Book book : this.list) {
            System.out.println(book.getTitle());
        }
    }
    public void returnBook(String title) {
        for (Book book : this.list) {
            if (title.equals(book.getTitle())) {
                book.returned();
                System.out.println("You have returned " + book.getTitle());
            }
        }
    }
}
