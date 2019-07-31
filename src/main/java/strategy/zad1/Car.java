package strategy.zad1;

import lombok.Getter;
@Getter
public class Car {
    private String plates;
    private IDrive engine;
    private long speed;
    private double fuelLevel;
    private int batteryLevel;

    IDrive iDriveEngine;

    public Car(String plates) {
        this.plates = plates;
        this.speed = 0;
        this.fuelLevel = 100L;
        this.batteryLevel = 800;
    }

    void przyspiesz() {
        fuelLevel += iDriveEngine.getEngineFuelConsumptionn();
        if (fuelLevel <= 0) {
            fuelLevel = 0;
            System.err.println("Not enough fuel!");

        } else {
            batteryLevel += iDriveEngine.getEnginePowerConsumption();
            if (batteryLevel <= 0) {
                batteryLevel = 0;
                System.err.println("Not enough power!");
            } else if (batteryLevel >= 1000) {
                batteryLevel = 1000;
                System.err.println("Battery full!");
            }
        }
        if (batteryLevel <= 1000 && fuelLevel > 0 && batteryLevel > 0) {
            speed += (0.02 * iDriveEngine.getEnginePower());
        }
    }

    void zwolnij() {
        fuelLevel += (-1 * iDriveEngine.getEngineFuelConsumptionn());
        batteryLevel += (-1 * getIDriveEngine().getEnginePowerConsumption());
        speed -= (0.05 * iDriveEngine.getEnginePower());
    }

    public void setiDriveEngine(IDrive iDriveEngine) {
        this.iDriveEngine = iDriveEngine;
    }

    @Override
    public String toString() {
        return  "Blachy = " + plates +
                "\nPredkosc = " + speed +
                "\nPoziom paliwa = " + fuelLevel +
                "\nPoziom akumulatora =" + batteryLevel;
    }
}
