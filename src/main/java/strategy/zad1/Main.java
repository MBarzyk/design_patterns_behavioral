package strategy.zad1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Car car1 = new Car("spalinowy");
        Car car2 = new Car("elektryczny");
        Car car3 = new Car("hybrydowy");
        List<Car> carList = new ArrayList<>(Arrays.asList(car1, car2, car3));

        car1.setiDriveEngine(new CombustionEngine());
        car2.setiDriveEngine(new ElectricEngine());
        car3.setiDriveEngine(new HybridEngine());

        String car = null;
        do {
            System.out.println("Wybierz rodzaj samochodu: [spalinowy][elektryczny][hybrydowy]");
            car = scanner.nextLine();
            if (!car.equalsIgnoreCase("spalinowy") && !car.equalsIgnoreCase("elektryczny") && !car.equalsIgnoreCase("hybrydowy")) {
                System.err.println("Niewłaściwy wybór!");
                car = null;
            }
        } while (car == null);

        String command;
        String finalCar = car;
        Car chosenCar = carList.stream().filter(c -> c.getPlates().equalsIgnoreCase(finalCar)).findFirst().get();

        do {

            System.out.println("Co zrobić? [przyspiesz][zwolnij][stan][exit]");
            command = scanner.nextLine();
            switch (command.toLowerCase()) {
                case "przyspiesz": {
                    chosenCar.przyspiesz();
                    System.out.println("Samochód ma teraz prędkość: " + chosenCar.getSpeed());
                    break;
                }
                case "zwolnij": {
                    chosenCar.zwolnij();
                    System.out.println("Samochód ma teraz prędkość: " + chosenCar.getSpeed());
                    break;
                }

                case "stan": {
                    System.out.println(chosenCar.toString());
                    break;
                }
                default: {
                    if (command.equalsIgnoreCase("exit")) {
                        System.out.println("Bye bye");
                    } else {
                        System.err.println("Zła komenda! Podaj jeszcze raz.");
                    }
                    break;
                }
            }

        } while (!command.equalsIgnoreCase("exit"));
    }
}
