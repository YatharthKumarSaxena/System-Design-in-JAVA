package Design_Patterns.Structural_Design_Principle;

import Design_Patterns.Structural_Design_Principle.Adapter_Design_Pattern.*;
import Design_Patterns.Structural_Design_Principle.Composite_Design_Pattern.Media_Collection;
import Design_Patterns.Structural_Design_Principle.Decorator_Design_Pattern.HighQualityMediaDecorator;

import java.util.ArrayList;

public class Multimedia_App {
    public static void main(String[] args) {
        Media video = new Video("Jurrasic_Park.mp4");
        Media audio = new Audio("We_Will_Meet_Again/Fat_Rat.mp3");
        Image img = new Image("Pikachu.jpg");
        Media image = new Image_Adapter(img);

        Media highQualityAudio = new HighQualityMediaDecorator(audio);

        Media_Collection allMedia = new Media_Collection(new ArrayList<>());
        allMedia.addMedia(video);
        allMedia.addMedia(highQualityAudio);
        allMedia.addMedia(image);

        allMedia.play();
    }
}
