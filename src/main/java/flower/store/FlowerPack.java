package flower.store;

import lombok.ToString;

@ToString
public class FlowerPack {
    private Flower flower;
    private int amount;
//    Implement FlowerPack class with attributes flower and
//    amount. Implement method getPrice in it.

    public FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    public Flower getFlower() {
        return flower;
    }

    public double getPrice() {
        return this.amount * this.flower.getPrice();
    }
}
