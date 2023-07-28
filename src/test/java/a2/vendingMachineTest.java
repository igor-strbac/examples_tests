package a2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class vendingMachineTest {

    private vendingMachine vMach;

    @BeforeEach
    public void setUp() {
        vMach = new vendingMachine();
    }

    @Test
    public void testAddItemAndGetPrice() {
        vMach.addItem("Soda", 1.5);
        vMach.addItem("Chips", 1.0);
        vMach.addItem("Candy", 0.75);

        Assertions.assertEquals(1.5, vMach.getItemPrice("Soda"), 0.001, "Get item price for Soda failed");
        Assertions.assertEquals(1.0, vMach.getItemPrice("Chips"), 0.001, "Get item price for Chips failed");
        Assertions.assertEquals(0.75, vMach.getItemPrice("Candy"), 0.001, "Get item price for Candy failed");
        Assertions.assertEquals(0.0, vMach.getItemPrice("Water"), 0.001, "Get item price for non-existent item failed");
    }

}