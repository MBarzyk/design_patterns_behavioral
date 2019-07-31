package strategy.zad3;

public class Main {
    public static void main(String[] args) {
        Auto samochod_1 = new Auto.Builder().setModel("Audi_turbo").createAuto();
        Auto samochod_2 = new Auto.Builder().setModel("Toyota_eco").createAuto();
        Auto samochod_3 = new Auto.Builder().setModel("Mercedes_normal").createAuto();

        samochod_1.setDriveMode(new TurboMode());
        samochod_2.setDriveMode(new EcoMode());
        samochod_3.setDriveMode(new NormalMode());

        samochod_1.increaseSpeed();
        System.out.println(samochod_1.toString());
        samochod_1.decreaseSpeed();
        System.out.println(samochod_1.toString());
    }
}
