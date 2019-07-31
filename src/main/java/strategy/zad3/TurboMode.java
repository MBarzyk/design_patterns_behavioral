package strategy.zad3;

public class TurboMode implements IDriveMode {
    @Override
    public int getSpeedIncrease() {
        return 10;
    }

    @Override
    public double getGasRelease() {
        return 0.05;
    }

    @Override
    public double getEngineWear() {
        return 0.1;
    }

    @Override
    public double getBreaksWear() {
        return 0.1;
    }
}
