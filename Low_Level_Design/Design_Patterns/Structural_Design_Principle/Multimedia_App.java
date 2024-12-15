package Design_Patterns.Structural_Design_Principle;

import Design_Patterns.Structural_Design_Principle.Adapter_Design_Pattern.*;
import Design_Patterns.Structural_Design_Principle.Composite_Design_Pattern.Media_Collection;
import Design_Patterns.Structural_Design_Principle.Decorator_Design_Pattern.HighQualityMediaDecorator;
import Design_Patterns.Structural_Design_Principle.Decorator_Design_Pattern.LowQualityMediaDecorator;

import java.util.ArrayList;

// Implementation of Structural Design Pattern

public class Multimedia_App {
    public static void main(String[] args) {

        // Creation of Media Objects
        Media video = new Video("Jurrasic_Park.mp4");
        Media audio = new Audio("We_Will_Meet_Again/Fat_Rat.mp3");
        Image img = new Image("Pikachu.jpg");
        Media image = new Image_Adapter(img);

        // Creation of Low Quality and High Quality of media objects
        Media highQualityAudio = new HighQualityMediaDecorator(audio);
        Media lowQualityVideo = new LowQualityMediaDecorator(video);

        // Using Composite Design Pattern Classes to make our Multimedia app function
        Media_Collection allMedia = new Media_Collection(new ArrayList<>());
        allMedia.addMedia(lowQualityVideo);
        allMedia.addMedia(highQualityAudio);
        allMedia.addMedia(image);

        // Final Play of Structural Design Pattern
        allMedia.play();
    }
}
