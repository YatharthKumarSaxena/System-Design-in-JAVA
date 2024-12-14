package Design_Patterns.Behavioral_Design_Pattern.Strategy_Design_Pattern;

public class UpperCaseStrategy implements TextFormattingStrategy{
    @Override
    // Member Function
    public String format(String text) {
        return text.toUpperCase();
    }
}
