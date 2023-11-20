import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import Fabric.*;

// public class App {
//     public static void main(String[] args) throws Exception {

//         List<ItemGenerator> generators = new ArrayList<>();

//         generators.add(new GoldGenerator());
//         generators.add(new GemGenerator());
//         generators.add(new SilverGenerator());
//         generators.add(new BronzeGenerator());
//         generators.add(new PlatinumGenerator());
//         generators.add(new OpalGenerator());
//         generators.add(new AlexandriteGenerator());

//         Random random = ThreadLocalRandom.current();
//         for (int i = 0; i < 10; i++) {
//             int index = random.nextInt(7);
//             generators.get(index).openReward();
//         }

//     }
// }

public class App {
    public static void main(String[] args) {
        List<ItemGenerator> generators = iFabric();
        Random random = ThreadLocalRandom.current();

        for (int i = 0; i < 80; i++) {
            int index = random.nextInt(generators.size());
            generators.get(index).openReward();
        }
    }

    // Инициализация фабрик
    public static List<ItemGenerator> iFabric() {

        List<ItemGenerator> genarators = new ArrayList<>();
        genarators.add(new GemGenerator());

        for (int i = 0; i < 3; i++) {
            genarators.add(new GoldGenerator());
        }

        for (int i = 0; i < 10; i++) {
            genarators.add(new PlatinumGenerator());
            genarators.add(new SilverGenerator());
            genarators.add(new OpalGenerator());
            genarators.add(new BronzeGenerator());
            genarators.add(new AlexandriteGenerator());

        }
        return genarators;
    }
}