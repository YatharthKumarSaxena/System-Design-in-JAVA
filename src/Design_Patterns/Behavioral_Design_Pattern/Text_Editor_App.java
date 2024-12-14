package Design_Patterns.Behavioral_Design_Pattern;

import Design_Patterns.Behavioral_Design_Pattern.Command_Design_Pattern.FormatTextCommand;
import Design_Patterns.Behavioral_Design_Pattern.Command_Design_Pattern.TextEditorCommand;
import Design_Patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.TextConsoleObserver;
import Design_Patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.TextEditor;
import Design_Patterns.Behavioral_Design_Pattern.Observer_Design_Pattern.TextEditorObserver;
import Design_Patterns.Behavioral_Design_Pattern.Strategy_Design_Pattern.LowerCaseStrategy;
import Design_Patterns.Behavioral_Design_Pattern.Strategy_Design_Pattern.TextFormattingStrategy;
import Design_Patterns.Behavioral_Design_Pattern.Strategy_Design_Pattern.UpperCaseStrategy;

import java.util.Scanner;

public class Text_Editor_App {

    public static void main(String[] args) {

        // Taking an input text from the user to convert it into lowercase
        System.out.print("Please enter the text to be converted into lower case :- ");
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();

        // Need to create the Text Editor itself (means creating the object of Text Editor)
        TextEditor textEditor = new TextEditor();

        // Text Editor Observers (Example Console)
        TextEditorObserver textEditorObserver = new TextConsoleObserver();

        // Register all the Observers with the Text Editor
        textEditor.registerObserver(textEditorObserver);
        textEditor.setCurrentText("Welcome to the World of Programming, \n This Program is created by Yatharth Kumar Saxena");
        textEditor.setCurrentText(inputText);

        // We need to have the Formatters
        TextFormattingStrategy upperCaseStrategy = new UpperCaseStrategy();
        TextFormattingStrategy lowerCaseStrategy = new LowerCaseStrategy();

        // Command to create the Text
        TextEditorCommand textEditorCommand = new FormatTextCommand(upperCaseStrategy,textEditor,"Welcome to the World of Programming,\nThis Program is created by Yatharth Kumar Saxena");
        textEditorCommand.execute();
        textEditor.notifyObserver();
        TextEditorCommand textEditorCommandUser = new FormatTextCommand(lowerCaseStrategy,textEditor,inputText);
        textEditorCommandUser.execute();
        textEditor.notifyObserver();
    }


}
