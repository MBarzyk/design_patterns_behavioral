package strategy.example;

import com.javagda25.design_patterns.behavioral.strategy.example.strategie.IStrategia;

public class Hero {
    private String name;

    private IStrategia strategia;


    public Hero(String name) {
        this.name = name;
    }

    public void setStrategia(IStrategia strategia) {
        this.strategia = strategia;
    }

    public void walcz () {
        strategia.walcz();
    }
}
