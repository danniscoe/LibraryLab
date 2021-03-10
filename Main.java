package com.tts;

import java.awt.print.Book;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        //test of book class
        Book bk = new Book("She's Come Undone");

        System.out.println("Title: " + bk.getTitle());
        System.out.println("Borrowed? : " + bk.isLoaned());
        bk.loaned();
        System.out.println("Borrowed? : " + bk.isLoaned());
        bk.returned();
        System.out.println("Borrowed?: " + bk.isLoaned());

        //add the two libraries
        Library libraryOne = new Library("424 Texas Street");
        Library libraryTwo = new Library("1212 Captain Shreve Drive");

        //Add four books to the library one
        libraryOne.addBook(new Book("She's Come Undone"));
        libraryOne.addBook(new Book("I Know This Much is True"));
        libraryOne.addBook(new Book("The Hour I First Believed"));
        libraryOne.addBook(new Book("We Are Water"));

        //Print hours of operation and location

        //System.out.println("Library One");
        System.out.println(libraryOne.openHours());
        //System.out.println(libraryTwo.openHours());
        System.out.println(libraryOne.printAddr());
        //System.out.println("Library Two");
        System.out.println(libraryTwo.printAddr());

        // Try to borrow We Are Water from both libraries
        System.out.println("Borrowing We Are Water:");
        libraryOne.borrowBook("We Are Water");
//        libraryOne.borrowBook("We Are Water");
        libraryTwo.borrowBook("We Are Water");
        System.out.println();

        // Print the titles of all available books from both libraries
        System.out.println("Books available in library one:");
        libraryOne.availableBooks();
        System.out.println();
        System.out.println("Books available in library two:");
        libraryTwo.availableBooks();
        System.out.println();

        // Return We Are Water to the first library
        System.out.println("Returning We Are Water:");
        libraryOne.returnBook("We Are Water");
        System.out.println();

        // Print the titles of available from the first library
        System.out.println("Books available in library one:");
        libraryOne.availableBooks();
    }

