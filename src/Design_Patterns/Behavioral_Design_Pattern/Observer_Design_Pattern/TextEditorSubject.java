package Design_Patterns.Behavioral_Design_Pattern.Observer_Design_Pattern;

public interface TextEditorSubject {

    // Register the Observers
    void registerObserver(TextEditorObserver observer);

    // Remove the Observers
    void removeObserver(TextEditorObserver observer);

    // Notify the Observers
    void notifyObserver();

}
