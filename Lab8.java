import java.util.Arrays;

public class Lab8 {
    public static void main(String[] args) {

        Manager manager = new Manager();

        ConsumerGoodCreator gc = ConsumerGoods::new; // посилання на конструктор
        manager.addConsumerGoods(gc.function(100d, "Sausage", 1, 100));

        manager.addConsumerGoods(new ConsumerGoods(200d, "Cheese", 2, 200));
        manager.addConsumerGoods(new ConsumerGoods(300d, "Meat", 3, 300));
        manager.display();

        System.out.println();
        System.out.println("======================================================");
        System.out.println();

        Arrays.asList(new ConsumerGoods(100d, "Sausage", 1, 100),
                new ConsumerGoods(200d, "Cheese", 2, 200),
                new ConsumerGoods(300d, "Meat", 3, 300))
                .stream()
                .sorted(ConsumerGoods::compareTo)  // посилання на не статичний метод класу
                .forEach(System.out::println);// Посилання на не статичний метод обьекту

        System.out.println();
        System.out.println("======================================================");
        System.out.println();

        Arrays.asList(new ConsumerGoods(100d, "Sausage", 1, 100),
                new ConsumerGoods(200d, "Cheese", 2, 200),
                new ConsumerGoods(300d, "Meat", 3, 300))
                .stream()
                .filter(Manager::isPriceBiggerThan200)  // Посилання на статичний метод класу
                .forEach(System.out::println);
    }
}
