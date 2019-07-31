package strategy.zad0.interfaces;

public class FormatterSplitter implements IFormatterCzcionki {
    @Override
    public String changeText(String textToChange) {
        return textToChange.replaceAll("", " ");
    }
}
