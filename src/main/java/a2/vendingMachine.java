package a2;

import java.util.HashMap;
import java.util.Map;

public class vendingMachine {

    private Map<String, Double> items;

    public vendingMachine() {
        items = new HashMap<>();
    }

    public void addItem(String item, double price) {
        items.put(item, price);
    }

    public double getItemPrice(String item) {
        return items.getOrDefault(item, 0.0);
    }
}
