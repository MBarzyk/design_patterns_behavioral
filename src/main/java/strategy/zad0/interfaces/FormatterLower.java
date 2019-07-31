package strategy.zad0.interfaces;

public class FormatterLower implements IFormatterCzcionki {
    @Override
    public String changeText(String textToChange) {
        return textToChange.toLowerCase();
    }
}
