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
        int notAMagicFoura = 4;
        int notAMagicThreea = 3;
        FlowerBucket a = new FlowerBucket();
        a.add(new FlowerPack(new Flower(FlowerType.TULIP), notAMagicFoura));
        a.add(new FlowerPack(new Flower(FlowerType.ROSE), notAMagicThreea));
        a.add(new FlowerPack(new Flower(FlowerType.CHAMOMILE), notAMagicFoura));
        Assertions.assertTrue(a.getPrice() > -1);
    }

    @Test
    public void testStore() {
        int notAMagicFour = 4;
        int notAMagicThree = 3;
        double notAMagicThreeF = 3.0;
        Store s = new Store();
        FlowerBucket a = new FlowerBucket();
        a.add(new FlowerPack(new Flower(FlowerType.TULIP), notAMagicFour));
        a.add(new FlowerPack(new Flower(FlowerType.ROSE, 2.0,
                notAMagicThreeF), 1));
        a.add(new FlowerPack(new Flower(FlowerType.ROSE), notAMagicThree));
        a.add(new FlowerPack(new Flower(FlowerType.CHAMOMILE), notAMagicFour));
        s.add(a);
        FlowerBucket b = new FlowerBucket();
        b.add(new FlowerPack(new Flower(FlowerType.TULIP), 2));
        b.add(new FlowerPack(new Flower(FlowerType.ROSE, 2.0,
                notAMagicThreeF), 1));
        b.add(new FlowerPack(new Flower(FlowerType.CHAMOMILE), notAMagicThree));
        s.add(b);
        Assertions.assertEquals("[FlowerPack(flower=Flower(price=2.0, "
                +
                "sepalLength=3.0, color=#FF0000, flowerType=ROSE), "
                +
                "amount=1), FlowerPack(flower=Flower(price=2.0, "
                +
                "sepalLength=3.0, color=#FF0000, flowerType=ROSE), "
                +
                "amount=1)]", s.search(
                new Flower(FlowerType.ROSE, 2.0,
                        3.0)).toString());
        Assertions.assertTrue(s.searchBool(new Flower(FlowerType.ROSE,
                2.0, 3.0)));
    }
}
