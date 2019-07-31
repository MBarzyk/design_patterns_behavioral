package strategy.example;

import com.javagda25.design_patterns.behavioral.strategy.example.strategie.StrategiaWalkiMieczem;

public class Main {
    public static void main(String[] args) {
        Hero geralt = new Hero("Geralt z Rivii");

        geralt.setStrategia(new StrategiaWalkiMieczem());
        geralt.walcz();
        geralt.walcz();
        geralt.walcz();
        geralt.walcz();


    }
}
