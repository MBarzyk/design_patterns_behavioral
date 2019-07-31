package strategy.zad0.interfaces;

public class FormatterUpper implements IFormatterCzcionki{
    @Override
    public String changeText(String textToChange) {
        return textToChange.toUpperCase();
    }
}
