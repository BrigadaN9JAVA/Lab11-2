import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Manager {
    List<Goods> goods;

    public Manager(){
        goods = new ArrayList<>();
    }

    public void addConsumerGoods(ConsumerGoods g){
        try {
            if (g.getId() <= 0) throw new IllegalArgumentException("Id is not correct");
            if (g.getPrice() <= 0) throw new IllegalArgumentException("Price is not correct");
            if (g.getWeight() <= 0) throw new IllegalArgumentException("Weight is not correct");
            goods.add(g);
        } catch (Exception err){
            System.out.println(err.getMessage());
        }
    }

    public void display(){
        goods.forEach(System.out::println); // Посилання на нестатичний метод обьекту
    }

    static public boolean isPriceBiggerThan200(Goods g){
        return g.getPrice() > 200;
    }
}
