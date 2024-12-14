package Design_Patterns.Behavioral_Design_Pattern.Observer_Design_Pattern;

public class TextConsoleObserver implements TextEditorObserver{
    @Override
    public void update(String text) {
        System.out.println("Text updated in console : " + text);
    }
}
