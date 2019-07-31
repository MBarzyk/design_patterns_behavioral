package strategy.zad2;

import strategy.zad2.strategies.FileStrategy;
import strategy.zad2.strategies.RandomStrategy;
import strategy.zad2.strategies.StdInStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj!");
        System.out.println("Podaj typ wejścia: (1-random, 2-stdin, 3-plik)");
        InputReader reader = new InputReader();

        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        if (type.equals("1")) {
            reader.setStrategy(new RandomStrategy());
        } else if (type.equals("2")) {
            reader.setStrategy(new StdInStrategy());
        } else if (type.equals("3")) {
            reader.setStrategy(new FileStrategy());
        }

        String command = null;
        do {
            System.out.println("Podaj komendę: [getint][getstring][getdouble][setstrategy]");
            command = sc.nextLine();
            if (command.equalsIgnoreCase("getint")) {
                System.out.println(reader.requestInt());
            } else if (command.equalsIgnoreCase("getstring")) {
                System.out.println(reader.requestString());
            } else if (command.equalsIgnoreCase("getdouble")) {
                System.out.println(reader.requestDouble());
            } else if (command.equalsIgnoreCase("setstrategy")) {
                System.out.println("Podaj typ strategii: [random][stdin][file]");
                type = sc.next();
                if (type.equalsIgnoreCase("random")) {
                    reader.setStrategy(new RandomStrategy());
                } else if (type.equalsIgnoreCase("stdin")) {
                    reader.setStrategy(new StdInStrategy());
                } else if (type.equalsIgnoreCase("file")) {
                    reader.setStrategy(new FileStrategy());
                }
            }
        } while (!command.equalsIgnoreCase("quit"));

    }
}
