package vending;

public class VendingMachine {

    private int changeAmount;

    public void putCoin(int coin) {
        this.changeAmount += coin;
    }

    public int getChangeAmount() {
        return this.changeAmount;
    }


    public CoinSet getChangeCoinSet() {
        CoinSet coinSet = new CoinSet();

        while(changeAmount >= 500) {
            coinSet.add(500);
            changeAmount -= 500;
        }

        while(changeAmount >= 100) {
            coinSet.add(100);
            changeAmount -= 100;
        }

        while(changeAmount >= 50) {
            coinSet.add(50);
            changeAmount -= 50;
        }

        while(changeAmount >= 10) {
            coinSet.add(10);
            changeAmount -= 10;
        }
        return coinSet;
    }

    public void selectDrink(Drink drink) {
        changeAmount -= drink.getPrice();
    }

}
