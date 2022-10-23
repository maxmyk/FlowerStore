package flower.store;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Flower {
    public Flower() {
    }

    public Flower(FlowerType type) {
        switch (type) {
            case CHAMOMILE:
                this.setFlowerType(FlowerType.CHAMOMILE);
                this.setColor(FlowerColor.WHITE);
                break;
            case TULIP:
                this.flowerType = FlowerType.TULIP;
                this.setColor(FlowerColor.BLUE);
                break;
            case ROSE:
                this.flowerType = FlowerType.ROSE;
                this.setColor(FlowerColor.RED);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + type);
        }
    }

    public void setFlowerType(FlowerType flType) {
        this.flowerType = flType;
    }

    private double price;
    private double sepalLength;
    private FlowerColor color;
    private FlowerType flowerType;

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
