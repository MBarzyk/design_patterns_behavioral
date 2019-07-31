package strategy.zad2.strategies;

import java.util.Scanner;

/**
 * Created by amen on 8/17/17.
 */
public class StdInStrategy implements IInputStrategy {
    private final Scanner scanner = new Scanner(System.in);

    public StdInStrategy() {
    }

    @Override
    public int getInt() {
        Integer number = null;
        do {
            String input = scanner.nextLine();
            try {
                number = Integer.parseInt(input);
            } catch (IllegalArgumentException e) {
                System.err.println("Input a number!");
            }
        } while (number == null);
        return number;

    }

    @Override
    public String getString() {
        return scanner.nextLine();
    }

    @Override
    public double getDouble() {
        Double number = null;
        do {
            String input = scanner.nextLine();
            try {
                number = Double.parseDouble(input);
            } catch (IllegalArgumentException e) {
                System.err.println("Input a number!");
            }
        } while (number == null);
        return number;
    }
}
