package Design_Patterns.Behavioral_Design_Pattern.Command_Design_Pattern;

import Design_Patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.TextEditor;
import Design_Patterns.Behavioral_Design_Pattern.Strategy_Design_Pattern.TextFormattingStrategy;

public class FormatTextCommand implements TextEditorCommand {

    // Data Members
    private TextFormattingStrategy textFormattingStrategy;
    private TextEditor textEditor;
    private String textToFormat;

    // Parameterized Constructor
    public FormatTextCommand(TextFormattingStrategy textFormattingStrategy, TextEditor textEditor, String textToFormat) {
        this.textFormattingStrategy = textFormattingStrategy;
        this.textEditor = textEditor;
        this.textToFormat = textToFormat;
    }

    // Member Function

    @Override
    public void execute() {
        System.out.println("Formatting the text");
        String formattedText = textFormattingStrategy.format(textToFormat);
        textEditor.setCurrentText(formattedText);
    }
}
