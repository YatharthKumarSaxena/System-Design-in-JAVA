package Design_Patterns.Structural_Design_Principle.Decorator_Design_Pattern;

import Design_Patterns.Structural_Design_Principle.Adapter_Design_Pattern.Media;

public class HighQualityMediaDecorator extends Media_Decorator{

    // Data Member
    protected Media decoratedMedia;

    // Parameterized Constructor
    public HighQualityMediaDecorator(Media decoratedMedia) {
        super(decoratedMedia);
    }

    // Member Function
    public void play(){
        super.play();
        System.out.println("Enhancing Playback Quality");
    }
}
