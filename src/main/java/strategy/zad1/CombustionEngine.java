package strategy.zad1;

public class CombustionEngine implements IDrive {
    @Override
    public double getEnginePowerConsumption() {
        return 50;
    }

    @Override
    public double getEngineFuelConsumptionn() {
        return -5;
    }

    @Override
    public double getEnginePower() {
        return 1000;
    }
}
