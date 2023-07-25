package com.takeo.week2.day1;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Adding books to the library
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 101);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 102);
        Book book3 = new Book("1984", "George Orwell", 103);
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        // Testing findBookById method
        int bookIdToFind = 102;
        Book foundBook = library.findBookById(bookIdToFind);
        if (foundBook != null) {
            System.out.println("Book found: " + foundBook);
        } else {
            System.out.println("Book with ID " + bookIdToFind + " not found.");
        }

        // Displaying all books in the library
        library.displayAllBooks();
    }
}
