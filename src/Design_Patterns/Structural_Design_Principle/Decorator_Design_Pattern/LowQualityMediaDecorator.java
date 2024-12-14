package Design_Patterns.Structural_Design_Principle.Decorator_Design_Pattern;

import Design_Patterns.Structural_Design_Principle.Adapter_Design_Pattern.Media;

// Implementation of Decorator_Design_Pattern
// Here We can observe that we can decorate the quality of media to different configuration
// The configuration here is Low Quality of Media

public class LowQualityMediaDecorator extends Media_Decorator{

    // Parameterized Constructor
    public LowQualityMediaDecorator(Media decoratedMedia) {
        super(decoratedMedia);
    }

    // Member Function

    @Override
    public void play() {
        super.play();
        System.out.println("Lowering Playback Quality");
    }
}
