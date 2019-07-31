package strategy.zad1;

public class HybridEngine implements IDrive{
    @Override
    public double getEnginePowerConsumption() {
        return -60;
    }

    @Override
    public double getEngineFuelConsumptionn() {
        return -3;
    }

    @Override
    public double getEnginePower() {
        return 750;
    }
}
