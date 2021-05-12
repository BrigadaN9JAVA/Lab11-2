@FunctionalInterface
public interface ConsumerGoodCreator {
    ConsumerGoods function(double price, String name, int id, double weight);
}
