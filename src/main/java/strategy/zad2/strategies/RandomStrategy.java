package strategy.zad2.strategies;

import java.util.Random;
import java.util.UUID;

/**
 * Created by amen on 8/17/17.
 */

public class RandomStrategy implements IInputStrategy {
    @Override
    public int getInt() {
        return new Random().nextInt();
    }

    @Override
    public String getString() {
       return UUID.randomUUID().toString().substring(0, 8).replace("-", "");
    }

    @Override
    public double getDouble() {
        return new Random().nextDouble();
    }
}
