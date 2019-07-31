package strategy.zad3;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Auto {
    private String model;
    private int speed;
    private double engineWear;
    private double breaksWear;
    private double gasReleased;
    private IDriveMode driveMode;


    public Auto(String model, int speed, double engineWear, double breaksWear, double gasReleased, IDriveMode driveMode) {
        this.model = model;
        this.speed = speed;
        this.engineWear = engineWear;
        this.breaksWear = breaksWear;
        this.gasReleased = gasReleased;
        this.driveMode = driveMode;
    }

    public void setDriveMode(IDriveMode driveMode) {
        this.driveMode = driveMode;
    }

    public void increaseSpeed() {
        speed += driveMode.getSpeedIncrease();
        engineWear -= driveMode.getEngineWear();
        gasReleased += driveMode.getGasRelease();
    }

    public void decreaseSpeed () {
        speed -= driveMode.getSpeedIncrease();
        breaksWear -= driveMode.getEngineWear();
    }


    public static class Builder {

        private String model;
        private int speed = 0;
        private double engineWear = 100;
        private double breaksWear = 100;
        private double gasReleased = 0;
        private IDriveMode driveMode;

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        public Builder setEngineWear(double engineWear) {
            this.engineWear = engineWear;
            return this;
        }

        public Builder setBreaksWear(double breaksWear) {
            this.breaksWear = breaksWear;
            return this;
        }

        public Builder setGasReleased(double gasReleased) {
            this.gasReleased = gasReleased;
            return this;
        }

        public Builder setDriveMode(IDriveMode driveMode) {
            this.driveMode = driveMode;
            return this;
        }

        public Auto createAuto() {
            return new Auto(model, speed, engineWear, breaksWear, gasReleased, driveMode);
        }
    }


    @Override
    public String toString() {
        return "Auto: " +
                "Model = " + model +
                ", Prędkość = " + speed +
                ", Stan silnika/100 = " + engineWear +
                ", Stan hamulców/100 = " + breaksWear +
                ", Uwolnione gazy = " + gasReleased;
    }
}
