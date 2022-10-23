package flower.store;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Random;

import org.junit.jupiter.api.Assertions;

public class FlowerTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_PRICE = 100;
    private Flower flower;

    @BeforeEach
    public void init() {
        flower = new Flower();
    }

    @Test
    public void testPrice() {
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        flower.setPrice(price);
        Assertions.assertEquals(price, flower.getPrice());
    }

    @Test
    public void testColor() {
        FlowerColor color = FlowerColor.RED;
        flower.setColor(color);
        Assertions.assertEquals("#FF0000", flower.getColor());
    }

    @Test
    public void testFlowerBucket() {
        FlowerBucket a = new FlowerBucket();
        a.add(new FlowerPack(new Flower(FlowerType.TULIP), 4));
        a.add(new FlowerPack(new Flower(FlowerType.ROSE), 3));
        a.add(new FlowerPack(new Flower(FlowerType.CHAMOMILE), 4));
        Assertions.assertTrue(a.getPrice() > -1);
    }

    @Test
    public void testStore() {
        Store s = new Store();
        FlowerBucket a = new FlowerBucket();
        a.add(new FlowerPack(new Flower(FlowerType.TULIP), 4));
        a.add(new FlowerPack(new Flower(FlowerType.ROSE, 2.0,
                3.0), 1));
        a.add(new FlowerPack(new Flower(FlowerType.ROSE), 3));
        a.add(new FlowerPack(new Flower(FlowerType.CHAMOMILE), 4));
        s.add(a);
        FlowerBucket b = new FlowerBucket();
        b.add(new FlowerPack(new Flower(FlowerType.TULIP), 2));
        b.add(new FlowerPack(new Flower(FlowerType.ROSE, 2.0,
                3.0), 1));
        b.add(new FlowerPack(new Flower(FlowerType.CHAMOMILE), 3));
        s.add(b);
        Assertions.assertEquals("[FlowerPack(flower=Flower(price=2.0, " +
                "sepalLength=3.0, color=#FF0000, flowerType=ROSE), amount=1), " +
                "FlowerPack(flower=Flower(price=2.0, sepalLength=3.0, " +
                "color=#FF0000, flowerType=ROSE), amount=1)]", s.search(
                new Flower(FlowerType.ROSE, 2.0,
                        3.0)).toString());
        Assertions.assertTrue(s.search_bool(new Flower(FlowerType.ROSE,
                2.0, 3.0)));
    }
}
