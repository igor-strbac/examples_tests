package a5;

import java.util.HashMap;
import java.util.Map;

public class bookStore {

    private Map<book, Integer> inventory;
    private double discountPercentage;

    public bookStore(double discountPercentage) {
        inventory = new HashMap<>();
        this.discountPercentage = discountPercentage;
    }

    public void addBook(book book, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("Empty");
        }
        inventory.put(book, inventory.getOrDefault(book, 0) + quantity);
    }

    public boolean hasBook(book book) {
        return inventory.containsKey(book);
    }

    public int getBookQuantity(book book) {
        return inventory.getOrDefault(book, 0);
    }

    public double calculateTotalPrice(book book, int quantity) {
        if (!hasBook(book)) {
            throw new IllegalArgumentException("Cart is empty");
        }
        int availableQuantity = getBookQuantity(book);
        if (quantity > availableQuantity) {
            throw new IllegalArgumentException("Too many items in cart");
        }
        return book.getPrice() * quantity * (1 - discountPercentage / 100.0);
    }

    public void purchase(book book, int quantity) {
        if (quantity <= 0) {
            throw new IllegalArgumentException("You need to put books in cart");
        }
        if (!hasBook(book)) {
            throw new IllegalArgumentException("Book not available");
        }
        int availableQuantity = getBookQuantity(book);
        if (quantity > availableQuantity) {
            throw new IllegalArgumentException("Too many books");
        }
        inventory.put(book, availableQuantity - quantity);
    }
}
