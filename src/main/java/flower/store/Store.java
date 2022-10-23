package flower.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    //    Implement class Store and method search in it.
//    Check Reading materials for search design.
//    (Head First Object-Oriented Analysis and Design — Chapter 1)
    private final List<FlowerBucket> buckets = new ArrayList<FlowerBucket>();

    public Store() {
    }

    public void add(FlowerBucket flowerBucket) {
        buckets.add(flowerBucket);
    }

    public List<FlowerPack> search(Flower flower) {
        List<FlowerPack> ans = new ArrayList<FlowerPack>();
        for (FlowerBucket bucket : buckets) {
            for (FlowerPack pack : bucket.packs) {
                if ((pack.getFlower().getFlowerType() ==
                        flower.getFlowerType()) &&
                        (pack.getFlower().getSepalLength() ==
                                flower.getSepalLength()) &&
                        (pack.getFlower().getPrice() ==
                                flower.getPrice())) {
                    ans.add(pack);
                }
            }
        }
        return ans;
    }

    public boolean search_bool(Flower flower) {
        return !this.search(flower).isEmpty();
    }
}
