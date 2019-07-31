package strategy.zad0;

import com.javagda25.design_patterns.behavioral.strategy.zad0.interfaces.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer printer = new Printer("HP DeskJet");
        String line;
        do {
            System.out.println("Podaj komendę do drukarki: [zmien][formatuj][exit]");
            line = scanner.nextLine();
            switch (line.toLowerCase()) {
                case "zmien":
                    System.out.println("Na co chcesz zmienić? [upper][lower][trimmer][inverter][splitter]");
                    String zmiana = scanner.nextLine();
                    switch (zmiana.toLowerCase()) {
                        case "upper":
                            printer.setFormatterCzcionki(new FormatterUpper());
                            break;
                        case "lower":
                            printer.setFormatterCzcionki(new FormatterLower());
                            break;
                        case "trimmer":
                            printer.setFormatterCzcionki(new FormatterTrim());
                            break;
                        case "inverter":
                            printer.setFormatterCzcionki(new FormatterInverter());
                            break;
                        case "splitter":
                            printer.setFormatterCzcionki(new FormatterSplitter());
                            break;
                        default:
                            if (line.equalsIgnoreCase("exit")) {
                                System.out.println("Bye bye");
                            } else {
                                System.err.println("Zła komenda! Podaj jeszcze raz.");
                            }
                            break;

                    }
                    break;
                case "formatuj":
                    System.out.println("Podaj tekst do sformatowania");
                    printer.print(scanner.nextLine());
                    break;
                default:
                    if (line.equalsIgnoreCase("exit")) {
                        System.out.println("Bye bye");
                    } else {
                        System.err.println("Zła komenda! Podaj jeszcze raz.");
                    }
                    break;
            }
        } while (!line.equalsIgnoreCase("exit"));
    }
}
