package strategy.zad0;

import com.javagda25.design_patterns.behavioral.strategy.zad0.interfaces.IFormatterCzcionki;

public class Printer {
    private String model;

    public Printer(String model) {
        this.model = model;
    }

    IFormatterCzcionki formatterCzcionki;

    public void setFormatterCzcionki(IFormatterCzcionki formatterCzcionki) {
        this.formatterCzcionki = formatterCzcionki;
    }

    public void print (String tekst) {
        System.out.println(formatterCzcionki.changeText(tekst));
    }
}
