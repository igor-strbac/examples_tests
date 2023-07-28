package a5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bookStoreTest {

    private bookStore bookStr;

    @BeforeEach
    public void setUp() {
        bookStr = new bookStore(10);
        book book1 = new book("Lolita", "Vladimir Nabokov", 20);
        book book2 = new book("Atonement", "Ian McEwan", 15);
        bookStr.addBook(book1, 5);
        bookStr.addBook(book2, 3);
    }

    @Test
    public void testAddBook() {
        book newBook = new book("Things Fall Apart (The African Trilogy, #1)", "Chinua Achebe", 25);
        bookStr.addBook(newBook, 10);
        Assertions.assertTrue(bookStr.hasBook(newBook), "Failed to adding book");
        Assertions.assertEquals(10, bookStr.getBookQuantity(newBook), "Failed to adding book");
    }

    @Test
    public void testCalculateTotalPrice() {
        book book1 = new book("On the Road", "Jack Kerouac", 20);
        Assertions.assertEquals(30, bookStr.calculateTotalPrice(book1, 2), 0.001, "Total price for /On the road/");
        book book2 = new book("The Sun Also Rises", "Ernest Hemingway", 15);
        Assertions.assertEquals(40.5, bookStr.calculateTotalPrice(book2, 3), 0.001, "Total price for /The Sun Also Rises/");
    }

    @Test
    public void testPurchase() {
        book book1 = new book("Possession", "A.S. Byatt", 20);
        bookStr.purchase(book1, 3);
        Assertions.assertEquals(2, bookStr.getBookQuantity(book1), "Can not purchase /Possession/");

        book book2 = new book("A Passage to India", "E.M. Forster", 15);
        bookStr.purchase(book2, 1);
        Assertions.assertEquals(2, bookStr.getBookQuantity(book2), "Can not purchase /A Passage to India/");
    }

    @Test
    public void testPurchaseWithInvalidQuantity() {
        book book1 = new book("I, Claudius (Claudius, #1)", "Robert Graves", 20);
        Assertions.assertThrows(IllegalArgumentException.class, () -> bookStr.purchase(book1, 0), "Invalid quantity");
    }

    @Test
    public void testPurchaseWithInsufficientQuantity() {
        book book1 = new book("Their Eyes Were Watching God", "Zora Neale Hurston", 20);
        Assertions.assertThrows(IllegalArgumentException.class, () -> bookStr.purchase(book1, 10), "Insufficient quantity");
    }

}