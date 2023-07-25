package com.takeo.week2.day1;

class Library {
    private static final int MAX_BOOKS = 100;
    private Book[] books;
    private int numBooks;

    public Library() {
        books = new Book[MAX_BOOKS];
        numBooks = 0;
    }

    public void addBook(Book book) {
        if (numBooks < MAX_BOOKS) {
            books[numBooks++] = book;
        } else {
            System.out.println("The library is full. Cannot add more books.");
        }
    }

    public Book findBookById(int bookId) {
        for (int i = 0; i < numBooks; i++) {
            if (books[i].getBookId() == bookId) {
                return books[i];
            }
        }
        return null;
    }

    public void displayAllBooks() {
        if (numBooks == 0) {
            System.out.println("No books in the library.");
            return;
        }

        System.out.println("List of books in the library:");
        for (int i = 0; i < numBooks; i++) {
            System.out.println(books[i]);
        }
    }
}

