package examples.j17;

import java.util.random.RandomGeneratorFactory;
import java.util.stream.IntStream;

public class RandomNumbers {

    public static IntStream get(int streamSize){
        return RandomGeneratorFactory.getDefault()
                .create().ints(streamSize);
    }
}
