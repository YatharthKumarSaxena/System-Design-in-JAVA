package Design_Patterns.Behavioral_Design_Pattern.Strategy_Design_Pattern;

public class LowerCaseStrategy implements TextFormattingStrategy{
    @Override
    // Member Function
    public String format(String text) {
        System.out.println("Converting the text to lower case");
        return text.toLowerCase();
    }
}
