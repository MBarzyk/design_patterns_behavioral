package strategy.zad1;

public class ElectricEngine implements  IDrive{
    @Override
    public double getEnginePowerConsumption() {
        return -100;
    }

    @Override
    public double getEngineFuelConsumptionn() {
        return 0;
    }

    @Override
    public double getEnginePower() {
        return 500;
    }
}
