package vending;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VendingMachineTest {
//    @Test
//    public void testGetChangeAmount() throws Exception {
//        VendingMachine machine = new VendingMachine();
//        machine.putCoin(100);
//        assertEquals(100, machine.getChangeAmount());
//
//        machine.putCoin(500);
//        assertEquals(600, machine.getChangeAmount());
//    }
//
//    @Test
//    public void testReturnChangeCoinSet_oneCoin_50() throws Exception {
//        VendingMachine machine = new VendingMachine();
//        machine.putCoin(100);
//        machine.putCoin(100);
//        machine.putCoin(500);
//
//        machine.selectDrink(new Drink("Cola", 650));
//
//        CoinSet expectedCoinSet = new CoinSet();
//        expectedCoinSet.add(50);
//        assertEquals(expectedCoinSet, machine.getChangeCoinSet());
//    }
//
//    @Test
//    public void testReturnChangeCoinSet_coins_180() throws Exception {
//        VendingMachine machine = new VendingMachine();
//        machine.putCoin(100);
//        machine.putCoin(100);
//        machine.putCoin(500);
//        machine.selectDrink(new Drink("Soda", 520));
//
//        CoinSet expectedCoinSet = new CoinSet();
//        expectedCoinSet.add(100);
//        expectedCoinSet.add(50);
//        expectedCoinSet.add(10);
//        expectedCoinSet.add(10);
//        expectedCoinSet.add(10);
//
//        assertEquals(expectedCoinSet, machine.getChangeCoinSet());
//
//    }

    @Test
    public void testReturnChangeCoinSet_coins_50() throws Exception {
        ChangeModule module = new ChangeModule();
        CoinSet expectedCoinSet = new CoinSet();
        expectedCoinSet.add(50);
        assertEquals(expectedCoinSet, module.getChangeCoinSet(50));
    }
    @Test
    public void testReturnChangeCoinSet_coins_180() throws Exception {
        ChangeModule module = new ChangeModule();
        CoinSet expectedCoinSet = new CoinSet();
        expectedCoinSet.add(100);
        expectedCoinSet.add(50);
        expectedCoinSet.add(10);
        expectedCoinSet.add(10);
        expectedCoinSet.add(10);
        assertEquals(expectedCoinSet, module.getChangeCoinSet(180));
    }
}
