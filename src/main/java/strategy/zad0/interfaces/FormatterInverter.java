package strategy.zad0.interfaces;

public class FormatterInverter implements IFormatterCzcionki{
    @Override
    public String changeText(String textToChange) {
        char[] charArray = textToChange.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char c : charArray) {
            if (Character.isLowerCase(c)) {
                builder.append(Character.toUpperCase(c));
            }
            else builder.append(Character.toLowerCase(c));
        }
        return builder.toString();
    }
}
