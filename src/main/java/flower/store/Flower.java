package flower.store;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@ToString
public class Flower {
    private static final int MAX_PRICE = 100;
    private static final int MAX_SEP_LEN = 50;
    private double price;
    private double sepalLength;
    private FlowerColor color;
    private FlowerType flowerType;

    public Flower() {
    }

    public Flower(FlowerType type) {
        double pricea = new Random().nextDouble() * MAX_PRICE;
        double sepalLengtha = new Random().nextDouble() * MAX_SEP_LEN;
        switch (type) {
            case CHAMOMILE:
                this.setFlowerType(FlowerType.CHAMOMILE);
                this.setColor(FlowerColor.WHITE);
                this.setPrice(pricea);
                this.setSepalLength(sepalLengtha);
                break;
            case TULIP:
                this.flowerType = FlowerType.TULIP;
                this.setColor(FlowerColor.BLUE);
                this.setPrice(pricea);
                this.setSepalLength(sepalLengtha);
                break;
            case ROSE:
                this.flowerType = FlowerType.ROSE;
                this.setColor(FlowerColor.RED);
                this.setPrice(pricea);
                this.setSepalLength(sepalLengtha);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    public Flower(FlowerType type, double price) {
        double sepalLengthb = new Random().nextDouble() * MAX_SEP_LEN;
        switch (type) {
            case CHAMOMILE:
                this.setFlowerType(FlowerType.CHAMOMILE);
                this.setColor(FlowerColor.WHITE);
                this.setPrice(price);
                this.setSepalLength(sepalLengthb);
                break;
            case TULIP:
                this.flowerType = FlowerType.TULIP;
                this.setColor(FlowerColor.BLUE);
                this.setPrice(price);
                this.setSepalLength(sepalLengthb);
                break;
            case ROSE:
                this.flowerType = FlowerType.ROSE;
                this.setColor(FlowerColor.RED);
                this.setPrice(price);
                this.setSepalLength(sepalLengthb);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    public Flower(FlowerType type, double price, double sepalLength) {
        switch (type) {
            case CHAMOMILE:
                this.setFlowerType(FlowerType.CHAMOMILE);
                this.setColor(FlowerColor.WHITE);
                this.setPrice(price);
                this.setSepalLength(sepalLength);
                break;
            case TULIP:
                this.flowerType = FlowerType.TULIP;
                this.setColor(FlowerColor.BLUE);
                this.setPrice(price);
                this.setSepalLength(sepalLength);
                break;
            case ROSE:
                this.flowerType = FlowerType.ROSE;
                this.setColor(FlowerColor.RED);
                this.setPrice(price);
                this.setSepalLength(sepalLength);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    public void setFlowerType(FlowerType flType) {
        this.flowerType = flType;
    }

    public String getColor() {
        return color.toString();
    }
//    public void createFlower(){
//        switch (flowerType){
//           case CHAMOMILE->new Flower().setFlowerType(FlowerType.CHAMOMILE);
//           case ROSE -> new Flower().setFlowerType(FlowerType.ROSE);
//           case TULIP -> new Flower().setFlowerType(FlowerType.TULIP);
//        }
//    }

//    public interface Flowers {
//        default void greet() {
//            System.out.println(this);
//        }
//    }

//    public static void main(String[] args) {
////        FlowerType.CHAMOMILE.greet();
//        Flower a = new Flower(FlowerType.TULIP);
//        System.out.println(a.flowerType);
//    }
}
