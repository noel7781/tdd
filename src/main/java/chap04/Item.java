package chap04;

public class Item {
    int price;
    String name;
    String category;
    public Item(String name, String category, int price) {

        this.name = name;
        this.category = category;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public Object getCategory() {
        return this.category;
    }
}
