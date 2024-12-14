package Design_Patterns.Behavioral_Design_Pattern.Observer_Design_Pattern;

import java.util.ArrayList;
import java.util.List;

// Implementation of Observer Design Pattern

public class TextEditor implements TextEditorSubject{

    // Data Member

    private List<TextEditorObserver> observerList = new ArrayList<>();
    private String currentText;

    // Member Functions

    @Override
    public void registerObserver(TextEditorObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void removeObserver(TextEditorObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for(TextEditorObserver observer: observerList){
            observer.update(this.currentText);
        }
    }

    public void setCurrentText(String currentText) {
        this.currentText = currentText;
    }
}
