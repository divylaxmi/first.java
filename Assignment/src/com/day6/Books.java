/*Create a Book class with bookId, bookName and authorName.Create parameterized constructor to initialize the object. Create an
ArrayList of type Book and store all book objects into collections and display all book details.*/ 
package com.day6;

import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

// Book class with bookId, bookName, and authorName fields
class Book {
    int bookId;
    String bookName;
    String authorName;

    // Parameterized constructor to initialize the book object
    public Book(int bookId, String bookName, String authorName) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author Name: " + authorName);
        System.out.println();
    }
}

public class Books {
    public static void main(String[] args) {
        // Create an ArrayList of type Book
        List<Book> books = new ArrayList<>();

        // Add Book objects to the ArrayList
        books.add(new Book(1, "To Kill a Mockingbird", "Harper Lee"));
        books.add(new Book(2, "1984", "George Orwell"));
        books.add(new Book(3, "The Great Gatsby", "F. Scott Fitzgerald"));
        books.add(new Book(4, "Moby Dick", "Herman Melville"));

        // Display details of all books in the ArrayList
        System.out.println("Book Details:");
        for (Book book : books) {
            book.displayDetails();
        }
    }
}
