package strategy.zad0.interfaces;

public class FormatterTrim implements IFormatterCzcionki {
    @Override
    public String changeText(String textToChange) {
        return textToChange.trim();
    }
}
