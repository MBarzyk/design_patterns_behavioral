package strategy.zad3;

public class NormalMode implements IDriveMode {
    @Override
    public int getSpeedIncrease() {
        return 5;
    }

    @Override
    public double getGasRelease() {
        return 0.02;
    }

    @Override
    public double getEngineWear() {
        return 0.05;
    }

    @Override
    public double getBreaksWear() {
        return 0.05;
    }
}
