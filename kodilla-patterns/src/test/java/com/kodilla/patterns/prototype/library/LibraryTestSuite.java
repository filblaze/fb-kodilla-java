package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class LibraryTestSuite {

    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("Biblioteka");
        Book book1 = new Book("title1", "author1", LocalDate.of(1990, 1, 1));
        Book book2 = new Book("title2", "author2", LocalDate.of(2000, 1, 1));
        Book book3 = new Book("title3", "author3", LocalDate.of(2010, 1, 1));
        Set<Book> books = library.getBooks();
        books.add(book1);
        books.add(book2);
        books.add(book3);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Biblioteka1");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Biblioteka2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        books.remove(book1);

        //Then
        System.out.println(library.books);
        System.out.println(clonedLibrary.books);
        System.out.println(deepClonedLibrary.books);
        assertEquals(2, library.books.size());
        assertEquals(2, clonedLibrary.books.size());
        assertEquals(3, deepClonedLibrary.books.size());
        assertEquals(library.books.size(), clonedLibrary.books.size());
        assertNotEquals(library.books.size(), deepClonedLibrary.books.size());
    }
}
