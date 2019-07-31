package strategy.zad3;

public class EcoMode implements IDriveMode {
    @Override
    public int getSpeedIncrease() {
        return 3;
    }

    @Override
    public double getGasRelease() {
        return 0.01;
    }

    @Override
    public double getEngineWear() {
        return 0.01;
    }

    @Override
    public double getBreaksWear() {
        return 0.01;
    }
}
