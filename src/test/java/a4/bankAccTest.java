package a4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bankAccTest {

    private bankAcc bAcc;

    @BeforeEach
    public void setUp() {
        bAcc = new bankAcc("123456789", 1000.0);
    }

    @Test
    public void testGetAccountNumber() {
        Assertions.assertEquals("123456789", bAcc.getAccountNumber(), "Account number failed");
    }

    @Test
    public void testGetBalance() {
        Assertions.assertEquals(1000.0, bAcc.getBalance(), 0.001, "Not enough balance");
    }

    @Test
    public void testDeposit() {
        bAcc.deposit(500.0);
        Assertions.assertEquals(1500.0, bAcc.getBalance(), 0.001, "No deposit");
    }

    @Test
    public void testDepositWithInvalidAmount() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> bAcc.deposit(0), "Invalid deposit");
    }

    @Test
    public void testWithdraw() {
        bAcc.withdraw(300.0);
        Assertions.assertEquals(700.0, bAcc.getBalance(), 0.001, "Failed to windrow money");
    }

    @Test
    public void testWithdrawWithInsufficientFunds() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> bAcc.withdraw(2000.0), "Not enough money");
    }

    @Test
    public void testWithdrawWithInvalidAmount() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> bAcc.withdraw(-100.0), "Invalid amount");
    }

}