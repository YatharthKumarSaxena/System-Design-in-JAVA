package Design_Patterns.Structural_Design_Principle.Decorator_Design_Pattern;

import Design_Patterns.Structural_Design_Principle.Adapter_Design_Pattern.Media;

// Normally Decorator Classes are kept as Abstract

public abstract class Media_Decorator implements Media {

    // Data Member
    protected Media decoratedMedia; // protected is taken so that it is accessed by its derived classes

    // Parameterized Constructor
    public Media_Decorator(Media decoratedMedia){
        this.decoratedMedia = decoratedMedia;
    }

    // Member Function
    public void play() {
        this.decoratedMedia.play();
    }
}
